package util;

import model.Diretor;
import repository.DiretorRepository;
import service.DiretorService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Diretor diretor = new Diretor(10, "Morgana", "09812346754", 1000.00, 5.00);

        DiretorService service = new DiretorService();

        service.save(diretor);

        diretor.setNome(diretor.getNome() + " - substituido");

        service.update(diretor);

        DiretorRepository repository = new DiretorRepository();

        repository.findAll();

        repository.findById(10);

    }
}
