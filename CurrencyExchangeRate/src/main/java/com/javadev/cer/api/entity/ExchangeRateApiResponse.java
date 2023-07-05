package com.javadev.cer.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRateApiResponse {
    private String baseCurrency;
    private String exchangeRateDate;
    private Map<String, Double> rates;
}
