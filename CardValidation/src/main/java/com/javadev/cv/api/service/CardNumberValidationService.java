package com.javadev.cv.api.service;

import org.springframework.stereotype.Service;

@Service
public class CardNumberValidationService {
    public boolean doValidateCard(String cardNumber) {
        int sum = 0;
        boolean doubleDigit = false;

        for(int i = cardNumber.length() -1 ; i >=0; i--) {
            int digit = Character.getNumericValue(cardNumber.charAt(i));

            if(doubleDigit) {
                digit *= 2;
                if(digit > 9) {
                    digit = digit % 10 + digit / 10;
                }
            }
             sum += digit;
            doubleDigit = !doubleDigit;
        }
        return sum % 10 == 0;
    }
}
