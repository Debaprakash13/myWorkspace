package com.javadev.ce.api.controller;

import com.javadev.ce.api.service.CurrencyRateService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class CurrencyExchangeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CurrencyRateService service;

    @Test
    public void testGetMaxSellingPriceForCurrency() throws Exception {
        when(service.getMaxSellingPriceForCurrency(anyString(),anyString())).thenReturn(103.00);
    }
}
