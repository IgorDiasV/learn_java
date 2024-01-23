package exercicios.secao13.exerciciofixacao.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private String email;
    private Date birthDate;

    public Client(String name, String email, Date birthDate){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String toString(){
        return "Client: " + this.name + " (" + sdf.format(this.birthDate) + ") - " + this.email;
    }
}
