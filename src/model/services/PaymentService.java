package model.services;

public interface PaymentService {

    public Double paymentFee(Double amount);
    public Double interest (Double amout, Integer months);
}
