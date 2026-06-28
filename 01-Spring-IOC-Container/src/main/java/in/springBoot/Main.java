package in.springBoot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


//        OrderFood food = context.getBean(OrderFood.class);
//        food.order();

        User u1 = context.getBean(User.class);
        String  name = u1.getName();
        int age = u1.getAge();

        System.out.println(name + " " + age);
    }
}
