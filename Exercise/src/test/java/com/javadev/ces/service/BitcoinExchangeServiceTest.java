package com.javadev.ces.service;


import com.javadev.ces.api.blockchain.api.BlockchainFeignClient;
import com.javadev.ces.api.exmo.api.ExmoFeignClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.math.BigDecimal;

import static org.mockito.Mockito.when;

@SpringBootTest
public class BitcoinExchangeServiceTest {

    @MockBean
    private BlockchainFeignClient blockchainfeignCLient;

    @MockBean
    private ExmoFeignClient exmoFeignClient;

    @Autowired
    private BitcoinExchangeService bitcoinExchangeService;

    @Test
    public void givenTwoCurrencies_ThenReturnExmoIsHighestSellingPrice() {
        String currency1 = "USD";
        String currency2 = "BTC_USD";

        BigDecimal blockchainUSDPrice = new BigDecimal(308534.99);
        BigDecimal exmoUSDPrice = new BigDecimal(408534.99);
        String exchangeName = "Exmo";

        //when(blockchainfeignCLient.getCurrencies()).thenReturn(blockchainUSDPrice);

    }
}
