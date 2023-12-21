package Sistemajogodexadrez.bordeGame;

public class Piece {
    protected Position position;
    private Borde borde;

    public Piece(Borde borde){
        this.borde = borde;
    }

    protected Borde getBorde(){
        return borde;
    }
}
