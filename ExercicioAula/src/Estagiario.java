public class Estagiario extends Matricula{

    @Override
    public Double getSalario() {
        return super.getSalario() + (super.getSalario() * 0.10);

    }
}
