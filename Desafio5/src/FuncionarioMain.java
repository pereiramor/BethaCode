public class FuncionarioMain {

    public static  void main (String [] args) {
        Funcionario funcionario = FuncionarioBuilder.criaFuncionario("ANALISTA", 1, "MORGANA", "09329761432", 2900.00);

        Folha folhaJulho = new Folha(1,funcionario,"30/07/2020");
        folhaJulho.calcular();
        System.out.println("Salario Julho: " +folhaJulho.getSalarioLiquido());

        Folha folhaAgosto = new Folha(2,funcionario,"30/08/2020");

        Desconto [] descontos = new Desconto[4];
        descontos [0] = new Desconto(1,"UNIMED",70.00);
        descontos [1] = new Desconto(2,"SINDICATO", 50.00);
        descontos [2] = new Desconto(3,"Farmacia Sesi",30.00);
        descontos [3] = new Desconto(4,"Farmacia PP", 90.00);

        folhaAgosto.calcular(descontos);
        System.out.println( "Salario Agosto: " +folhaAgosto.getSalarioLiquido());

        Folha folhaSetembro = new Folha(3,funcionario,"30/09/2020");

        descontos [0] = new Desconto(1,"UNIMED",70.00);
        descontos [1] = new Desconto(2,"SINDICATO", 50.00);
        descontos [2] = new Desconto(3,"Farmacia Sesi",30.00);
        descontos [3] = new Desconto(4,"Farmacia PP", 90.00);

        folhaSetembro.calcular(descontos,100.00);
        System.out.println( "Salario Setembro: " +folhaSetembro.getSalarioLiquido());


        Folha folhaOutubro = new Folha(4,funcionario,"30/10/2020");

        descontos [0] = new Desconto(1,"UNIMED",70.00);
        descontos [1] = new Desconto(2,"SINDICATO", 50.00);
        descontos [2] = new Desconto(3,"Farmacia Sesi",30.00);
        descontos [3] = new Desconto(4,"Farmacia PP", 90.00);

        folhaOutubro.calcular(descontos,50.00);
        System.out.println( "Salario Outubro: " +folhaOutubro.getSalarioLiquido());
    }
}
