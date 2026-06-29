package in.springBoot4.LazyInitialization;

import in.springBoot4.LazyInitialization.PaymentService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OrderService {

    PaymentService paymentService;
    OrderService(@Lazy PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService Created");
    }

    public void order()
    {
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
