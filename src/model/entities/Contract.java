package model.entities;

import java.time.LocalDate;

import model.services.PaymentService;

public class Contract {
    private int number;
    private LocalDate date;
    private Double value;
    private int installments;

    private PaymentService paymentService;

    
    public Contract() {
    }


    


    public Contract(int number, LocalDate date, Double value, int installments, PaymentService paymentService) {
        this.number = number;
        this.date = date;
        this.value = value;
        this.installments = installments;
        this.paymentService = paymentService;
    }





    public int getNumber() {
        return number;
    }


    public void setNumber(int number) {
        this.number = number;
    }


    public LocalDate getDate() {
        return date;
    }


    public void setDate(LocalDate date) {
        this.date = date;
    }


    public Double getValue() {
        return value;
    }


    public void setValue(Double value) {
        this.value = value;
    }


    public int getInstallments() {
        return installments;
    }


    public void setInstallments(int installments) {
        this.installments = installments;
    }





    public PaymentService getPaymentService() {
        return paymentService;
    }





    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    

}
