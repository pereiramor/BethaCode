// importando classe do swing
import javax.swing.JOptionPane;

public class DesafioEntradaDeDados {
    public static void main (String[] args){
        String nome;
        String senha;
        //Este comando mostra um dialogo que solicita entrada de dados
        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        senha = JOptionPane.showInputDialog("Digite senha");
        String mensagem = nome+ "Logado com sucesso";
        JOptionPane.showMessageDialog (null, mensagem);

    }
}

