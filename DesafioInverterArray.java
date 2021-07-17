public class DesafioInverterArray {

    public static void main(String[] args) {
        //declara o vetor
        int []numero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // percorrer o vetor
        for (int i =  numero.length -1; 0 <= i; --i) {
            System.out.println("Invertido = " + numero[i]);

        }

    }
}