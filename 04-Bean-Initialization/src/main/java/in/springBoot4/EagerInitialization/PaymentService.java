package in.springBoot4.EagerInitialization;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    PaymentService(){
        System.out.println("PaymentService Created");
    }

    public void pay(){
        System.out.println("Payment Successful");
    }
}
