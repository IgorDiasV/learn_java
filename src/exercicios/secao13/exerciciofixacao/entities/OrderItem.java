package exercicios.secao13.exerciciofixacao.entities;

public class OrderItem {
    private Integer quantity;
    private Product product;
    private Client client;

    public OrderItem(Integer quantity, Product product, Client client){
        this.quantity = quantity;
        this.product = product;
        this.client = client;
    }

    public Double subTotal(){
        return this.quantity*this.product.getPrice();
    }
    
    public String toString(){
        return this.product.getName() + ", $" + this.product.getPrice() +", Quantity: " + this.quantity + ", Subtotal: " + subTotal();
    }
}
