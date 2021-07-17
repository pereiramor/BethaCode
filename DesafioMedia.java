public class DesafioMedia {
    public static void main (String[] args){
        // declara o vetor
        double valores []  = { 5, 3.5, 1, 7, 5 };
        // cria a soma para fazer a média
        double soma = 0;
        // percorrer o vetor somando os valores
        for (int indice = 0; indice < valores.length; indice++) {
            System.out.println("indice => " + indice);
            System.out.println("soma = " + soma + " + " + valores[indice] );
            soma = soma + valores[indice];
        }
        System.out.println("soma => " + soma);
        System.out.println("quantidade => " + valores.length);
        System.out.println("média => " + (soma / valores.length));
    }
}
