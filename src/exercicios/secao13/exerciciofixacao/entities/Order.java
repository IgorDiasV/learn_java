package exercicios.secao13.exerciciofixacao.entities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;
public class Order {
    private Date moment;
    private OrderStatus status;
    private List<OrdemItem> items = new ArrayList<>();

    public Order(OrderStatus status){
        this.status = status;
        this.moment = new Date();

    }

    public void addItem(OrdemItem item){
        this.items.add(item);
    }

    public void removeItem(OrdemItem item){
        this.items.remove(item);
    }

    public Double total(){
        double sum=0;
        for (OrdemItem item: this.items) {
            sum += item.subTotal();
        }

        return sum;
    }
}
