public class Operadores {
    
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + " " + "JAVA";

        System.out.println(nomeCompleto);

        String concatenacao ="?";

/*Nesse trecho conseguimos ver que após encontrar a primeira string, o sinal de + deixa
de realizar a operação de soma e passa a concatenar os numeros e strings restantes*/
        
        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        /*No trecho seguinte, o programa prioriza as informações em parenteses
        realizando a operação de 1+1+1 primeiro e depois concatenando com o "1"*/

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);
    
//no trecho abaixo testamos uma incrementação, quando o ++ é adicionado antes da
//variavel, ele incrementa primeiro, depois age, quando é colocado depois da variavel
//ele age, depois incrementa, o mesmo vale para o decremento.

        int numero = 5;
        
        System.out.println(numero ++);

        System.out.println(numero);

        System.out.println(++ numero);

        System.out.println(numero);
        
    }
}
