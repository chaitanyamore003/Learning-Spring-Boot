package in.springBoot4.LazyInitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Since PaymentService is marked with @Lazy, its bean is NOT created
        // when the ApplicationContext starts.
        // The bean is created only when getBean(PaymentService.class) is called.
        // PaymentService paymentService = context.getBean(PaymentService.class);
        // paymentService.pay();


        // OrderService is also marked with @Lazy, so it is not created at
        // ApplicationContext startup either.
        // When getBean(OrderService.class) is called, Spring creates the
        // OrderService bean. Since OrderService depends on PaymentService,
        // Spring also creates the PaymentService bean at that moment.
        OrderService orderService = context.getBean(OrderService.class);
        orderService.order();
    }
}