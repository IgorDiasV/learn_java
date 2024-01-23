package exercicios.secao13.exercicio1.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import exercicios.secao13.exercicio1.entities.enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Department department;
    private List<HourContrat> contrats = new ArrayList<>();

    public Worker(String name, WorkerLevel level, double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
        
    }

    public void addContrat(HourContrat contrat){
        this.contrats.add(contrat);


    }

    public void removeContract(HourContrat contrat){
        this.contrats.remove(contrat);

    }

    public double income(Integer year, Integer month){
        double sum = this.baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContrat contrat: this.contrats){
            cal.setTime(contrat.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH) + 1;
            if(c_year == year && c_month == month){
                sum += contrat.totalValue();
            }
        }
        return sum;
    }
    
}
