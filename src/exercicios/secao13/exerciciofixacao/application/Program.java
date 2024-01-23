package exercicios.secao13.exerciciofixacao.application;

import entities.enums.OrderStatus;
import exercicios.secao13.exerciciofixacao.entities.Client;
import exercicios.secao13.exerciciofixacao.entities.Order;
import exercicios.secao13.exerciciofixacao.entities.OrderItem;
import exercicios.secao13.exerciciofixacao.entities.Product;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter client data");
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Enter client email");
        String email = sc.next();

        System.out.println("Birth date(DD/MM/YYYY): ");
        String birthDateStr = sc.next();
        
        Client client = new Client(name, email, sdf.parse(birthDateStr));

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        String status = sc.next();

        Order order = new Order(OrderStatus.valueOf(status), client, new Date());
        System.out.println("How many items to this order? ");
        int qtd = sc.nextInt();

        for(int i=0; i<qtd; i++){
            System.out.println("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.println("Product price: ");
            double price = sc.nextDouble();

            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            
            Product product = new Product(productName, price);
            OrderItem item = new OrderItem(quantity, product, client);

            order.addItem(item);

        }

        System.out.println(order);
        sc.close();
    }
}
