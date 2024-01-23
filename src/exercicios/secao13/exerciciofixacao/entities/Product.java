package exercicios.secao13.exerciciofixacao.entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}
