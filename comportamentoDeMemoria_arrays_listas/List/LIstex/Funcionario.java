package comportamentoDeMemoria_arrays_listas.List.LIstex;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salaty;

    public Funcionario(){
    }

    public Funcionario(Integer id, String nome, Double salaty){
        this.id = id;
        this.nome = nome;
        this.salaty = salaty;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    
    public void setId(String nome){
        this.nome = nome;
    }
    public Double getSalaty(){
        return salaty;
    }
    
    public void setSalaty(Double salaty){
        this.salaty = salaty;
    }

    public void increaseSalay(Double percentual){
        salaty += salaty * percentual /100.0;
    }

    public String toString(){
        return id + ", " + nome + ", " + String.format("%.2f", salaty);
    }
}
