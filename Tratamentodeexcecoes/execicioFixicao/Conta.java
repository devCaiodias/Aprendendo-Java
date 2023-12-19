package Tratamentodeexcecoes.execicioFixicao;

import Tratamentodeexcecoes.execicioFixicao.model.ErrorException;

public class Conta {
    private Integer numero;
    private String name;
    private Double dinheiro;
    private Double retirarLimite;

    public Conta(){}

    public Conta(Integer numero,String name,Double dinheiro,Double retirarLimite){
        this.numero = numero;
        this.name = name;
        this.dinheiro = dinheiro;
        this.retirarLimite = retirarLimite;
    }

    public Integer getNumero(){
        return numero;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }

    public String getNome(){
        return name;
    }

    public void setName(String nome){
        this.name = nome;
    }

    public Double getDinheiro(){
        return dinheiro;
    }

    public void setDinheiro(Double dinheiro){
        this.dinheiro = dinheiro;
    }

    public Double getRetirarlimit(){
        return retirarLimite;
    }

    public void setRetirarlimit(Double retirarL){
        this.retirarLimite = retirarL;
    }

    public void depositar(Double quantidade){
        this.dinheiro += dinheiro + quantidade;
    }

    public void retirar(Double quantidade){
        if (dinheiro < retirarLimite) {
            throw new ErrorException("Not enough balance");
        }
        if (retirarLimite < quantidade) {
            throw new ErrorException("The amount exceeds withdraw limit");
        }
        this.dinheiro = dinheiro - quantidade;
    }


}
