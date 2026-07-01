package in.springBoot.learningSpringBoot;

import in.springBoot.learningSpringBoot.ConfigurationProperties.PaymentGateway;
import in.springBoot.learningSpringBoot.Value.PaymentGateway1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningSpringBootApplication {

	public static void main(String[] args) {

		org.springframework.context.ApplicationContext context = SpringApplication.run(LearningSpringBootApplication.class, args);

		//trying @Value configuration
		PaymentGateway1 paymentGateway1 = context.getBean(PaymentGateway1.class);
		System.out.println("Trying `@Value` Configuration");
		System.out.println(paymentGateway1.getType());
		System.out.println(paymentGateway1.isEnabled());
		System.out.println(paymentGateway1.getRetryCount());
		System.out.println(paymentGateway1.getTimeout());

		System.out.println();

		//trying @ConfigurationProperties
		PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
		System.out.println("Trying `@ConfigurationProperties` Configuration");
		System.out.println(paymentGateway.getType());
		System.out.println(paymentGateway.isEnabled());
		System.out.println(paymentGateway.getRetryCount());
		System.out.println(paymentGateway.getTimeOutMinutes());

	}


}
