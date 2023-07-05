package com.javadev.tx.dto;

import com.javadev.tx.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingResponse {

    private String status;
    private double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;
}
