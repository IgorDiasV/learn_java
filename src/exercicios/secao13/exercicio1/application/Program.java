package exercicios.secao13.exercicio1.application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

import exercicios.secao13.exercicio1.entities.Department;
import exercicios.secao13.exercicio1.entities.HourContrat;
import exercicios.secao13.exercicio1.entities.Worker;
import exercicios.secao13.exercicio1.entities.enums.WorkerLevel;
public class Program {
    public static void main(String[] args) throws ParseException{

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter department's name: ");
        String departamentName = scan.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.println("Level: ");
        String level = scan.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = scan.nextDouble();

        System.out.println("how many contracts to this work? ");
        int numContracts = scan.nextInt();
        
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departamentName));

        for(int i=0; i<numContracts; i++){
            
            System.out.println("Enter contract #" + i+1 + " data");
            System.out.println("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(scan.next());
            
            System.out.println("Value per hour: ");
            double valuePerHour = scan.nextDouble();

            System.out.println("Duration (hours): ");
            int hours = scan.nextInt();

            HourContrat hourContrat = new HourContrat(date, valuePerHour, hours);

            worker.addContrat(hourContrat);
            
        }
        System.out.println("Enter month and year to calculate income (MM/yyyy): ");
        String dateStr = scan.next();
        int month;
        int year;
        month = Integer.parseInt(dateStr.split("/")[0]);
        year =  Integer.parseInt(dateStr.split("/")[1]);
        System.out.println(worker.income(year, month));

    }
    
}
