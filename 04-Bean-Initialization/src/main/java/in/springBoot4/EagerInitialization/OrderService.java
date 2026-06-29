package in.springBoot4.EagerInitialization;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    OrderService(){
        System.out.println("OrderService Created");
    }

    public void Order(){
        System.out.println("Order Placed");
    }
}
