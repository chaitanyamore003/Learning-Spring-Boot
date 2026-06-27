package in.springBoot;

import org.springframework.stereotype.Component;

@Component
public class OrderFood {
    private Payment payment;

    public OrderFood(Payment payment){
        this.payment = payment;
    }
    public void order(){
        payment.pay();
        System.out.println("Order Placed");
    }
}
