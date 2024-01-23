import entities.enums.OrderStatus;
import exercicios.secao13.exerciciofixacao.entities.Order;

import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter client data");
        String name = sc.nextLine();

        System.out.println("Enter client email");
        String email = sc.next();

        System.out.println("Birth date(DD/MM/YYYY): ");
        String birthDateStr = sc.next();

        System.out.println("Enter order data: ");
        String status = sc.next();

        System.out.println("How many items to this order? ");
        int qtd = sc.nextInt();

        for(int i=0; i<qtd; i++){
            System.out.println("Product name: ");
            String productName = sc.nextLine();

            System.out.println("Product price: ");
            double price = sc.nextDouble();

            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            x
        }

        
    }
}
