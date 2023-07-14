package com.javadev.cv.api.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CardNumberValidationServiceTest {

    @Autowired
    private CardNumberValidationService cardNumberValidationService;

    @Test
    public void doCardValidationTestInvalid() {
        String cardNumber = "11111111111111";
        cardNumberValidationService = new CardNumberValidationService();
        boolean validateCard = cardNumberValidationService.doValidateCard(cardNumber);
        assertEquals(false, validateCard);
    }

    @Test
    public void doCardValidationTestValid() {
        String cardNumber = "42424242426742";
        cardNumberValidationService = new CardNumberValidationService();
        boolean validateCard = cardNumberValidationService.doValidateCard(cardNumber);
        assertEquals(true, validateCard);
    }
}
