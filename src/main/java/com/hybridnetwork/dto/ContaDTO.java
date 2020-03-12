package com.hybridnetwork.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaDTO extends AbstractDTO {

    private String nome;
    private BigDecimal saldoInicial;

    public ContaDTO() { super(); }

    public ContaDTO(Integer id, String nome, BigDecimal saldoInicial) {
        super(id);
        this.nome = nome;
        this.saldoInicial = saldoInicial.setScale(2, RoundingMode.HALF_EVEN);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(BigDecimal saldoInicial) {
        this.saldoInicial = saldoInicial.setScale(2, RoundingMode.HALF_EVEN);
    }
}
