package model.services;

public class PaypalService implements PaymentService {

    @Override
    public Double paymentFee(Double amount) {
        return amount*0.02;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount *months/100;
    }

    
    
}
