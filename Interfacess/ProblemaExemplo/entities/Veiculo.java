package Interfacess.ProblemaExemplo.entities;

public class Veiculo {
    private String nomeCarro;

    public Veiculo(){}

    public Veiculo(String nomeCarro){
        this.nomeCarro = nomeCarro;
    }

    public String getNomeCarro(){
        return nomeCarro;
    }

    public void setNomeCarro(String nomeC){
        this.nomeCarro = nomeC;
    }
}
