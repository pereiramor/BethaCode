package service;

public class ProdutoService implements Persistivel{
    @Override
    public void save() {
        System.out.println("SALVANDO: ");
    }

    @Override
    public void update() {
        System.out.println("ATUALIZANDO");
    }

    @Override
    public void remove() {
        System.out.println("REMOVENDO: ");
    }
}
