package Sistemajogodexadrez.ChessLayer;

import Sistemajogodexadrez.bordeGame.Borde;
import Sistemajogodexadrez.bordeGame.Piece;

public class ChessPiece extends Piece {
    
    private Color color;
    private int moverContagem;
    
    public ChessPiece(Borde borde, Color color,int moverContagem) {
        super(borde);
        this.color = color;
        this.moverContagem = moverContagem;
    }

    public Color getColor(){
        return color;
    }
    
    public int getMoverContagem(){
        return moverContagem;
    }

    public void setMoverContagem(int moverContagem){
        this.moverContagem = moverContagem;
    }
}
