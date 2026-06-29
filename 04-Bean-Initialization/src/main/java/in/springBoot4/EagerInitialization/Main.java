package in.springBoot4.EagerInitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);


        //By Default each component is SingleTon and Initialization is - Eager
        //hence objects are created at the same time the ApplicationContext is called in main
    }
}
