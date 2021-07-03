public class ProgramaQuadrado {
    public static void main(String[] args) {

        for (int i = 15; i <= 35; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i + " igual " + (int) i * i);
        }
    }
}

