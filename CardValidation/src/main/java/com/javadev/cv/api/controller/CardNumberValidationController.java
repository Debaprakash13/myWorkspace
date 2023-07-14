package com.javadev.cv.api.controller;

import com.javadev.cv.api.service.CardNumberValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/card", produces = "application/json", consumes = "application/json")
public class CardNumberValidationController {
    @Autowired
    private CardNumberValidationService cardNumberValidationService;


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/number/{cardNumber}")
    public boolean doCardValidation(@PathVariable(name = "cardNumber") String cardNumber) {
        return cardNumberValidationService.doValidateCard(cardNumber);
    }
}
