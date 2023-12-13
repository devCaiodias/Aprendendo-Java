package enumeracoes_composicao.excicioRevisar;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Posts {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private String titulo;
    private String contente;
    private Integer likes;

    private List<Comente> coments = new ArrayList<>();

    public Posts(){}

    public Posts(Date momento, String titulo, String contente, Integer likes){
        this.momento = momento;
        this.contente = contente;
        this.titulo = titulo;
        this.likes = likes;
    }

    public Date getMomento(){
        return momento;
    }

    public void setMomento(Date momento){
        this.momento = momento;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getContente(){
        return contente;
    }

    public void setContente(String contente){
        this.contente = contente;
    }

    public Integer getLikes(){
        return likes;
    }

    public void setLikes(Integer likes){
        this.likes = likes;
    }

    public List<Comente> getComente(){
        return coments;
    }


    public void addComente(Comente comente){
        coments.add(comente);
    }

    public void removeComente(Comente comente){
        coments.remove(comente);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(titulo + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(momento) + "\n");
        sb.append(contente + "\n");
        sb.append("Comente: \n");
        for (Comente c : coments) {
            sb.append(c.getTexto() + "\n ");
        }
        return sb.toString();
    }
    
}
