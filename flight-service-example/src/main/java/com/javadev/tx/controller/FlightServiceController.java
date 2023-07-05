package com.javadev.tx.controller;

import com.javadev.tx.dto.FlightBookingRequest;
import com.javadev.tx.dto.FlightBookingResponse;
import com.javadev.tx.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableTransactionManagement
public class FlightServiceController {

    @Autowired
    private FlightBookingService bookingService;

    @PostMapping("/bookFlightTicket")
    public FlightBookingResponse bookFlightTicket(@RequestBody FlightBookingRequest request) {
        return bookingService.bookFlightTicket(request);
    }
}
