package model.services;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

    private PaymentService paymentService;

    public void processContract (Contract Contract, Integer months){ 

           for(int i=1;i<=months;i++){
           Installment inst = new Installment();
           inst.setDueDate(Contract.getDate().plusMonths(i));
           Double x= (Contract.getTotalValue()/months)+
           paymentService.interest(Contract.getTotalValue()/months, i);
           inst.setAmount ((Contract.getTotalValue()/months)+
           paymentService.interest(Contract.getTotalValue()/months, i)+paymentService.paymentFee(x));
           Contract.getInstallments().add(inst);
        }
    }

    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    

}
