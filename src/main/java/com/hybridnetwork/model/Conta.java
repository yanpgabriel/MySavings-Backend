package com.hybridnetwork.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Entity(name = "tb_conta")
public class Conta {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, precision = 2)
    private BigDecimal saldoInicial;

    public Conta() { }

    public Conta(Integer id, String nome, BigDecimal saldoInicial) {
        this.id = id;
        this.nome = nome;
        this.saldoInicial = saldoInicial.setScale(2, RoundingMode.HALF_EVEN);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
