package _9_patterns._hw._adapter;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("12345678", LocalDate.now());
        PayPalAccount payPalAccount = new PayPalAccount("qwe@qwe.com", "qwe");

        new Market().pay(creditCard, 10);
        new Market().pay(payPalAccount, 20);
    }
}
