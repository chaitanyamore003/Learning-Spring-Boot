package in.springBoot3.SingletonScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class OrderService {
    public OrderService() {
        System.out.println("OrderService Created");
    }
}
