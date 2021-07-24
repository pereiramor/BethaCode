public class MatriculaMain {

    public static void main (String [] args) {

        Matricula matricula1 = MatriculaBuilder.criaMatricula( "ESTAGIARIO");
        matricula1.setSalario(1000.00);

        System.out.println("Estagiario:" + matricula1.getSalario());

        Matricula matricula2 = MatriculaBuilder.criaMatricula( "FUNCIONARIO");
        matricula2.setSalario(1000.00);

        System.out.println("FUNCIONARIO:" + matricula2.getSalario());

    }
}
