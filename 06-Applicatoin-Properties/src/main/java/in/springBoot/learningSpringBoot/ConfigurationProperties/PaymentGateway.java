package in.springBoot.learningSpringBoot.ConfigurationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {
    PaymentConfigurations paymentConfigurations;

    @Autowired
    public PaymentGateway(PaymentConfigurations paymentConfigurations) {
        this.paymentConfigurations = paymentConfigurations;
    }

    public String getType(){
        return paymentConfigurations.getType();
    }

    public int getRetryCount(){
        return paymentConfigurations.getRetryCount();
    }

    public boolean isEnabled(){
        return paymentConfigurations.isEnabled();
    }

    public int getTimeOutMinutes(){
        return paymentConfigurations.getTimeout();
    }
}
