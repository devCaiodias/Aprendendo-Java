package enumeracoes_composicao.execiciofixacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

    private static SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy ");

    private String name;
    private String email;
    private Date  aniversario;

    public Cliente(){}
    
    public Cliente(String nome, String email, Date aniversario){
        this.name = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getNome(){
        return name;
    }

    public void setNome(String nome){
        this.name = nome;
    }
    
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Date getAniversario(){
        return aniversario;
    }

    public void setNome(Date aniversario){
        this.aniversario = aniversario;
    }

    @Override
    public String toString(){
        return name + " (" + sfd.format(aniversario) + ") - "+ email;
    }
}
