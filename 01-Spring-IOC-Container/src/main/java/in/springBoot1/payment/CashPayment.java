package in.springBoot2.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cp")
public class CashPayment implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Payment via Cash");
    }
}
