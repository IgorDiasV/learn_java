import java.util.Locale;
import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		char entradaChar;
		
		entradaChar = sc.next().charAt(0);
		System.out.println("Você digitou: " + entradaChar);
		
		String entradaTexto;
		entradaTexto = sc.next();
		System.out.println("Você digitou: " + entradaTexto);
		
		int entradaInt;
		entradaInt = sc.nextInt();
		System.out.println("Você digitou: " + entradaInt);
		
		//obs: o java leva em consideração a localidade, logo, os números decimais são separados por virgula
		//para separar por ponto é necessario definir o localidade como eua usando o comando a baixo
		// Locale.setDefault(Locale.US); 
		
		double entradaDouble;
		entradaDouble = sc.nextDouble();
		System.out.println("Você digitou: " + entradaDouble);
		
		sc.close();
	}

}
