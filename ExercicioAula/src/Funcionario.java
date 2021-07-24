public class Funcionario extends Matricula{

    @Override
    public Double getSalario() {
        return super.getSalario() + (super.getSalario() * 0.20);
    }
}
