package model;

import java.math.BigDecimal;

public class Vendedor extends Pessoa{

    //Vendedor estende de Pessoa Abstrata

    //Atributo
    private BigDecimal percentualComisao;


    //Construtor
    public Vendedor(Long id, String nome, String cpf, String endereco, String telefone) {
        super(id, nome, cpf, endereco, telefone);
    }

    //get e set

    public BigDecimal getPercentualComisao() {
        return percentualComisao;
    }

    public void setPercentualComisao(BigDecimal percentualComisao) {

        this.percentualComisao = percentualComisao;
    }
}
