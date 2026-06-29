package in.springBoot2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    private PaymentService paymentService;

//    OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void order(){
        paymentService.pay();
        orderDetails();
        System.out.println("Order Done");
    }

    public void orderDetails(){
        System.out.println("Order Details");
    }
}
