package in.springBoot3.PrototypeScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);

        //in Prototype scope everytime new object is created per object call as dependency or getBean.
        OrderService orderService = context.getBean(OrderService.class);
        OrderService orderService1 = context.getBean(OrderService.class);

        //will return false
        System.out.println(orderService == orderService1);
    }
}
