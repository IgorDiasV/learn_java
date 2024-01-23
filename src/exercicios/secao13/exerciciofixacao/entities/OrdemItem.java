package exercicios.secao13.exerciciofixacao.entities;

public class OrdemItem {
    private Integer quantity;
    private Double price;
    private Product product;
    private Client client;

    public OrdemItem(Integer quantity, Double price, Product product, Client client){
        this.quantity = quantity;
        this.price = price;
        this.product = product;
        this.client = client;
    }

    public Double subTotal(){
        return this.quantity*this.price;
    }
    
}
