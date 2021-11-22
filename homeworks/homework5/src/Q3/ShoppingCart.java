package Q3;

import java.util.*;

public class ShoppingCart {

    //private PaymentStrategy paymentStrategy;
    private List<Item> list;

    public ShoppingCart(){
        list = new ArrayList<>();
    }

    public void addItem(Item item){
        list.add(item);
    }

    public void removeItem(Item item){
        list.remove(item);
    }

    public int calculateTotal(){
        int res = 0;
        for(Item i : list){
            res += i.getPrice();
        }
        return res;
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(this.calculateTotal());
    }
}
