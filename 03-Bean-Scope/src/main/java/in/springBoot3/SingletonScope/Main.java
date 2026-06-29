package in.springBoot3.SingletonScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //in Singleton scope only 1 object is created per Bean Defination
        OrderService orderService = context.getBean(OrderService.class);
        OrderService orderService1 = context.getBean(OrderService.class);

        //will return true
        System.out.println(orderService == orderService1);
    }
}
