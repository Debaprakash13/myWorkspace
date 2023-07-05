package com.javadev.cer.api.controller;

import com.javadev.cer.api.service.ExchangeRateService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/exchange", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "Currency Exchange Service", tags = {"Currency Exchange Service"})
public class CurrencyExchangeController {

    @Autowired
    private ExchangeRateService rateService;


    @GetMapping("/currency/{baseCurrency}/max-selling-price/{targetCurrency}")
    public ResponseEntity<Double> getMaxSellingPriceForCurrency(@PathVariable("baseCurrency") String baseCurrency,
                                                                @PathVariable("targetCurrency") String targetCurrency) {
        Double maxSellingPrice = rateService.getMaxSellingPriceForCurrency(baseCurrency,targetCurrency);

        if(maxSellingPrice == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(maxSellingPrice);
    }
}
