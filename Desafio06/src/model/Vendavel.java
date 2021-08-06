package model;

import java.math.BigDecimal;

public interface Vendavel {
    public BigDecimal getValorUnitario();
    public String getDescricao();

    //Interface com seu contrato em que liga as classes produto e serviço
}
