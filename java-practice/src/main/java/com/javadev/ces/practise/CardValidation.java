package com.javadev.ces.practise;

public class CardValidation {

    public static void main(String[] args) {
        String cardNumber = "1111111111111111";//"4242424242426742";
        CardValidation cardValidation = new CardValidation();
        boolean b = cardValidation.validateCardNumber(cardNumber);
        System.out.println(b);
    }

    public boolean validateCardNumber(String cardNumber) {
        int sum = 0;
        boolean doubleDigit = false;

        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(cardNumber.charAt(i));

            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit = digit % 10 + digit / 10;
                }
            }

            sum += digit;
            doubleDigit = !doubleDigit;
        }

        return sum % 10 == 0;
    }
}
