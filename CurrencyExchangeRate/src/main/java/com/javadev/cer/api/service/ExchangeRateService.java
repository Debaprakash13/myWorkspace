package com.javadev.cer.api.service;

import com.javadev.cer.api.entity.ExchangeRateApiResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class ExchangeRateService {
    private final String exchangeRateServiceUrl = "https://api.exchangerate-api.com/v4/latest/";

    private final RestTemplate restTemplate;

    public ExchangeRateService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Double getMaxSellingPriceForCurrency(String baseCurrency, String targetCurrency) {
        ResponseEntity<ExchangeRateApiResponse> response = restTemplate.exchange(
                                                            exchangeRateServiceUrl + baseCurrency,
                                                                HttpMethod.GET,
                                                     null, ExchangeRateApiResponse.class);

        if(response.getStatusCode().is2xxSuccessful()) {
            ExchangeRateApiResponse exchangeRateApiResponse = response.getBody();
            if(exchangeRateApiResponse != null) {
                Map<String, Double> rates = exchangeRateApiResponse.getRates();
                if(rates.containsKey(targetCurrency)) {
                    return rates.get(targetCurrency);
                }
            }
        }
        return null;
    }
}
