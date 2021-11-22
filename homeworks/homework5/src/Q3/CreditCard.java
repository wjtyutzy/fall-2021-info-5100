package Q3;

public class CreditCard implements PaymentStrategy{
    private String cardNumber;

    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int num) {
        System.out.println("Credit Card: $" + num);
    }
}
