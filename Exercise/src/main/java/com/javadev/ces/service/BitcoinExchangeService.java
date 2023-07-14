package com.javadev.ces.service;

import com.javadev.ces.model.HighestPriceResponse;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class BitcoinExchangeService {
    public HighestPriceResponse getHighestSellingPrice(String currency1, String currency2) {

        return HighestPriceResponse.builder().build();
    }
}
