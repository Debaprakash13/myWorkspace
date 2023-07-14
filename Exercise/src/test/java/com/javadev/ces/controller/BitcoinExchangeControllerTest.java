package com.javadev.ces.controller;


import com.javadev.ces.model.HighestPriceResponse;
import com.javadev.ces.service.BitcoinExchangeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@ExtendWith(SpringExtension.class)
@WebMvcTest(BitcoinExchangeController.class)
public class BitcoinExchangeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BitcoinExchangeService bitcoinExchangeService;

    @Test
    public void getHighestSellingPriceShouldCallGetCurrencyService() throws Exception {
        BigDecimal  highestSellingPrice = new BigDecimal(13499.22);
        String currency1 = "USD";
        String currency2 = "BTC_USD";
        String exchangeName = "Exmo";
        HighestPriceResponse response = HighestPriceResponse.builder().apiName(exchangeName).price(highestSellingPrice).build();

        when(bitcoinExchangeService.getHighestSellingPrice(currency1,currency2)).thenReturn(response);
        mockMvc.perform(get("/api/bitcoinExchange/currency/{currency1}/highestSellingPrice/{currency2}", currency1,currency2)
                .contentType("application/json").accept("application/json"))
                .andExpect(jsonPath("$.apiName",equalTo(exchangeName)))
                .andExpect(jsonPath("$.price",equalTo(highestSellingPrice)));
    }



}
