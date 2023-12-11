package comportamentoDeMemoria_arrays_listas.vetor.ex05;

public class Altura {
    private String nome;
    private int idade;
    private double altura;

    public Altura(){
        
    }

    public Altura(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

}
