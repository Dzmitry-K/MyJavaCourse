package _9_patterns._hw._adapter;

public class CreditCardAdapter implements PaymentAdapter {
    private final CreditCard creditCard;

    public CreditCardAdapter(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public boolean collectMoney(Integer amount) {
        return this.creditCard.authorizeTransaction(amount).equals("Authorization code: as2321");
    }
}
