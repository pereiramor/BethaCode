package repository;

public class FaturadoRepository implements Buscavel{
    @Override
    public void FindByID() {
        System.out.println("LISTANDO POR ID: ");
    }

    @Override
    public void FindAll() {
        System.out.println("LISTANDO: ");
    }
}
