package com.javadev.ces.controller;

import com.javadev.ces.model.HighestPriceResponse;
import com.javadev.ces.service.BitcoinExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/bitcoinExchange/", produces = MediaType.APPLICATION_JSON_VALUE)
public class BitcoinExchangeController {

    @Autowired
    private BitcoinExchangeService bitcoinExchangeService;

    @GetMapping("currency/{currency1}/highestSellingPrice/{currency2}")
    public ResponseEntity<HighestPriceResponse> getHighestSellingPrice(@PathVariable("currency1") String currency1,
                                                                       @PathVariable("currency2") String currency2) {
        HighestPriceResponse response = bitcoinExchangeService.getHighestSellingPrice(currency1,currency2);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
