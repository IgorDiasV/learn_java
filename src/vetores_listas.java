import java.util.List;
import java.util.ArrayList;
public class vetores_listas {

    public static void main(String[] args) {

        // vetores 
        int[] numeros = new int[5];
        numeros[0] = 67;
        

        //  criando uma lista de strings
        List<String> lista = new ArrayList<>(); 

        // adicionando um elemento no final da lista
        lista.add("João");

        // adicionando um elemento em um posição especifica
        lista.add(0, "Maria");

        // retorna o tamanho da lista
        System.out.println(lista.size());
        // remove o primeiro elemento encontrado que contenha a string passada
        lista.remove("Maria");

        // remover o elemento do index 2
        lista.remove(2);

        // remove baseado em uma condição
        lista.removeIf(x -> x == "Maria");

        // informa o index da string passada
        lista.indexOf("João");

        // retorna uma lista filtrada pela condição passada
        List<String> filtrado = lista.stream().filter( x -> x == "João").collect(Collectors.toList());
        
    }
    
}
