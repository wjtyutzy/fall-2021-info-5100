package Q3;

public class PayPal implements PaymentStrategy{
    private String email;

    public PayPal(String str){
        this.email = str;
    }

    @Override
    public void pay(int num) {
        System.out.println("PayPal: $" + num);
    }
}
