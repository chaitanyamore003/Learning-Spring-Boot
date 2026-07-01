package in.springBoot.learningSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningSpringBootApplication {

	public static void main(String[] args) {

		org.springframework.context.ApplicationContext context = SpringApplication.run(LearningSpringBootApplication.class, args);

		OrderService orderService = context.getBean(OrderService.class);

		orderService.order();
	}


}
