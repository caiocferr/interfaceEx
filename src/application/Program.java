package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.println("Número: ");
        int number = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        sc.nextLine();
        LocalDate start = LocalDate.parse(sc.nextLine(), fmt);
        System.out.println("Valor do contrato: ");
        double value = sc.nextDouble();
        System.out.println("Número de parcelas: ");
        int vezes = sc.nextInt();
          
        Contract c= new Contract(number, start, value);
        ContractService cs = new ContractService(new PaypalService());

        cs.processContract(c, vezes);
        for (Installment e : c.getInstallments()) {
            System.out.println(e);
            
        }

        sc.close();

    }
}
