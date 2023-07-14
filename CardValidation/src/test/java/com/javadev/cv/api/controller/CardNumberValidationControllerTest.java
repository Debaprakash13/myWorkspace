package com.javadev.cv.api.controller;

import com.javadev.cv.api.service.CardNumberValidationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.internal.verification.VerificationModeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class CardNumberValidationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CardNumberValidationService cardNumberValidationService;

    @Test
    public void givenACardNumberShouldCallValidateCardServices() throws Exception {
        String cardNumber = "1111111111111111";

        when(cardNumberValidationService.doValidateCard(cardNumber)).thenReturn(true);

        mockMvc.perform(get("/card/number/{cardNumber}",cardNumber)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
        verify(cardNumberValidationService, VerificationModeFactory.times(1)).doValidateCard(cardNumber);
        verifyNoMoreInteractions(cardNumberValidationService);
    }

    @Test
    public void givenANullCardNumberShouldCallValidateCardServices() throws Exception {
        String cardNumber = "1111111111111111";

        when(cardNumberValidationService.doValidateCard(cardNumber)).thenReturn(true);

        mockMvc.perform(get("/card/number/{cardNumber}",cardNumber)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
        verify(cardNumberValidationService, VerificationModeFactory.times(1)).doValidateCard(cardNumber);
        verifyNoMoreInteractions(cardNumberValidationService);
    }
}
