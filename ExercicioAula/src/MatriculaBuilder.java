public class MatriculaBuilder {

    public static Matricula criaMatricula(String tipo) {
        if (tipo.equals("FUNCIONARIO")) {
            return new Funcionario();
        } else if
        (tipo.equals("ESTAGIARIO")) {
            return new Estagiario();
        }

        return new Funcionario();
    }

}


