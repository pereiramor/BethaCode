package model;

import java.math.BigDecimal;

public class PedidoItens {
    private Long id;
    private Vendavel vndavel;
    private BigDecimal desconto;
    private Integer quantidade;
    private BigDecimal valorTotal;

    public PedidoItens(Long id, Vendavel vndavel, BigDecimal desconto, Integer quantidade, BigDecimal valorTotal) {
        this.id = id;
        this.vndavel = vndavel;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vendavel getVndavel() {
        return vndavel;
    }

    public void setVndavel(Vendavel vndavel) {
        this.vndavel = vndavel;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
