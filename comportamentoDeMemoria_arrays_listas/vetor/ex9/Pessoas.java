package comportamentoDeMemoria_arrays_listas.vetor.ex9;

public class Pessoas {
    private String nome;
    private String email;
    private int room;

    public Pessoas(){

    }
    
    public Pessoas(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getRoom(){
        return room;
    }

    public void setRoom(int room){
        this.room = room;
    }


    @Override
    public String toString(){
        return nome + ", " + email;
    }
}
