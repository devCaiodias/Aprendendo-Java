package ProgramacaoFuncionaleExpressoesLambda.ExecicioFixa.entities;

public class Funcionarios {
    private String name;
    private String email;   
    private Double price;
    public Funcionarios(String name, String email, Double price) {
        this.name = name;
        this.email = email;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    
}
