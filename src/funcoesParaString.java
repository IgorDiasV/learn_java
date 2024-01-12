public class funcoesParaString {
    public static void main(String[] args) {
        String texto = "  teste TESTE  ";

        // deixa a string minuscula
        System.out.println('-' + texto.toLowerCase() + '-');
        // deixa a string maiuscula
        System.out.println('-' + texto.toUpperCase() + '-');
        // remove espaços no começo e no fim da string
        System.out.println('-' + texto.trim() + '-');

        // seleciona uma parte menor da string
        System.out.println(texto.substring(5));
        System.out.println(texto.substring(5, 8));

        // Substitui um trecho por outro 
        System.out.println(texto.replace("teste", "hello"));

        // indica o indice onde aparece pela primeira vez o texto pesquisado
        System.out.println(texto.indexOf("teste"));

        // indica o indice onde aparece pela ultima vez o texto pesquisado
        System.out.println(texto.lastIndexOf("teste"));

        // transforma a string em um vetor baseado no parametro usado pra dividir o texto
        System.out.println(texto.split(" ")[2]);
    }
}
