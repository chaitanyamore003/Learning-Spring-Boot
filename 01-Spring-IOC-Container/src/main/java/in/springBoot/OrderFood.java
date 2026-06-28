package in.springBoot;

import in.springBoot.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderFood {

    private final PaymentService paymentService;

    @Autowired
    OrderFood(@Qualifier("up") PaymentService paymentService){
        this.paymentService = paymentService;
    }


    public void order(){
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
