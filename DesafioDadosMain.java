import java.util.Scanner;

public class DesafioDadosMain {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite no máximo 4 digitos");
        String numeroInverterNovo = s.next();

        String invertido = "";
        for (int i = numeroInverterNovo.length() - 1; 0 <= i; i--) {
            invertido += numeroInverterNovo.charAt(i);
        }
        System.out.println(invertido);
    }
}

