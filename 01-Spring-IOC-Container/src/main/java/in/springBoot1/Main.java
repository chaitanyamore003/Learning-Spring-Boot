package in.springBoot2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(in.springBoot2.AppConfig.class);


//        OrderFood food = context.getBean(OrderFood.class);
//        food.order();

        in.springBoot2.User u1 = context.getBean(in.springBoot2.User.class);
        String  name = u1.getName();
        int age = u1.getAge();

        System.out.println(name + " " + age);
    }
}
