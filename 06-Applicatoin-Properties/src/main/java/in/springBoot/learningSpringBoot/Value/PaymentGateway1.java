package in.springBoot.learningSpringBoot.Value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway1 {

    //@Value("${payment-gateway.type:"Patym"}") here patym is a default or fallback value
    @Value("${payment-gateway.type}")
    private String type;

    @Value("${payment-gateway.retryCount}")
    private int retryCount;

    @Value("${payment-gateway.enabled}")
    private boolean enabled;

    @Value("${payment-gateway.timeOut}")
    private int timeout;

    public String getType() {
        return type;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public int getTimeout() {
        return timeout;
    }
}
