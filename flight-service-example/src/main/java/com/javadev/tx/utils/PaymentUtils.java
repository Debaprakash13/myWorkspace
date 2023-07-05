package com.javadev.tx.utils;

import com.javadev.tx.exception.InsufficentAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> paymenMap = new HashMap<>();

    static{
        paymenMap.put("acc1", 12000.0);
        paymenMap.put("acc2", 7000.0);
        paymenMap.put("acc3", 1000.0);
        paymenMap.put("acc4", 8000.0);
    }

    public static boolean validatePaymentAmount(String accNo, double amount) {
        if(amount > paymenMap.get(accNo)) {
            throw new InsufficentAmountException("insufficent funds");
        } else {
            return true;
        }
    }
}
