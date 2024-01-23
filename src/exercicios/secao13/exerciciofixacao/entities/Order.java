package exercicios.secao13.exerciciofixacao.entities;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import entities.enums.OrderStatus;
public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(OrderStatus status, Client client, Date moment){
        this.status = status;
        this.client = client;
        this.moment = moment;

    }

    public void addItem(OrderItem item){
        this.items.add(item);
    }

    public void removeItem(OrderItem item){
        this.items.remove(item);
    }

    public Double total(){
        double sum=0;
        for (OrderItem item: this.items) {
            sum += item.subTotal();
        }

        return sum;
    }

    public String toString(){
        StringBuilder ouput = new StringBuilder();
        ouput.append("ORDER SUMMARY: ");
        ouput.append("\nOrder moment: " + sdf.format(this.moment));
        ouput.append("\nOrder status: "+ this.status);
        ouput.append("\n"+this.client);
        ouput.append("\nOrder items");
        for(OrderItem item: this.items){
            ouput.append("\n"+item);
        }
        ouput.append("\nTotal price: $"+total());
        return ouput.toString();
    }
}
