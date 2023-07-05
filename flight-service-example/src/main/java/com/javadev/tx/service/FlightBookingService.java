package com.javadev.tx.service;

import com.javadev.tx.dto.FlightBookingRequest;
import com.javadev.tx.dto.FlightBookingResponse;
import com.javadev.tx.entity.PassengerInfo;
import com.javadev.tx.entity.PaymentInfo;
import com.javadev.tx.repository.PassengerInfoRepository;
import com.javadev.tx.repository.PaymentInformationRepository;
import com.javadev.tx.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Autowired
    private PaymentInformationRepository paymentInformationRepository;

    @Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public FlightBookingResponse bookFlightTicket(FlightBookingRequest request) {

        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();
        PaymentUtils.validatePaymentAmount(paymentInfo.getAccountNo(), passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getPid());
        paymentInfo.setAmount(passengerInfo.getFare());

        paymentInformationRepository.save(paymentInfo);
        return new FlightBookingResponse("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0], passengerInfo);
    }
}
