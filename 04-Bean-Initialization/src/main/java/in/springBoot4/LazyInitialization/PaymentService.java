    package in.springBoot4.LazyInitialization;

    import org.springframework.context.annotation.Lazy;
    import org.springframework.stereotype.Component;

    @Component
    @Lazy
    public class PaymentService {
        PaymentService(){
            System.out.println("PaymentService Created");
        }

        public void  pay(){
            System.out.println("Payment Successful");
        }
    }
