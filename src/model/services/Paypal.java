package model.services;

public class Paypal implements PaymentService {

    @Override
    public double installments(double value,int parc,int vezes) {
        double aux = value/vezes +(value/vezes*0.01*parc);
        return aux *1.02;

    }
    
}
