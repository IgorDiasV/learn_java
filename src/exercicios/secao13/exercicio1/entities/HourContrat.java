package exercicios.secao13.exercicio1.entities;

import java.util.Date;

public class HourContrat {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContrat(Date date, Double valuePerHour, Integer hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }
    public double totalValue(){
        return this.valuePerHour*this.hours;
    }
    public Date getDate(){
        return this.date;
    }
}
