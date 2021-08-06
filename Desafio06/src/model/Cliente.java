package model;

import java.math.BigDecimal;

public class Cliente extends Pessoa{
    //cliente classe que estende de Pessoa Abstrata

    //atributo

    private BigDecimal percentualDescontoMaximo;


    // construtor
    public Cliente(Long id, String nome, String cpf, String endereco, String telefone) {
        super(id, nome, cpf, endereco, telefone);
    }

    //get e set
    public BigDecimal getPercentualDescontoMaximo() {
        return percentualDescontoMaximo;
    }

    public void setPercentualDescontoMaximo(BigDecimal percentualDescontoMaximo) {
        this.percentualDescontoMaximo = percentualDescontoMaximo;
    }
}
