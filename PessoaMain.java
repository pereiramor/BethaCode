public class PessoaMain {
    public static void main (String[] args) {
       Cliente cliente = new Cliente ( 1,"Rosi", "rua Geral", "34346557", "09876543213","12312390", "F");

        System.out.println(cliente.getLimiteCredito());
        cliente.aumentarLimiteEm(20.0);

        cliente.aumentarLimiteEm(25.0);
        System.out.println(cliente.getLimiteCredito());

        cliente.diminuirLimite(10.0);
        System.out.println(cliente.getLimiteCredito());

        System.out.println(cliente);
    }
}
