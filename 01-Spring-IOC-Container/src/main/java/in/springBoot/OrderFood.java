package in.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderFood {

        /**types of Dependency Injection*/

        //method 1 - Field Injection
        @Autowired
        private Payment payment;


      //method 2 - using Constructor //MOST RECOMMENDED
//    @Autowired
//    public OrderFood(Payment payment){
//        this.payment = payment;
//    }

      //method 3 - Using Setter
//    @Autowired
//    public void setPayment(Payment payment) {
//        this.payment = payment;
//    }

     public void order(){
            payment.pay();
            System.out.println("Order Placed");
     }
}
