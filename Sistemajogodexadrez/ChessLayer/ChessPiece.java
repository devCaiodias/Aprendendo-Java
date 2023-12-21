package Sistemajogodexadrez.ChessLayer;

import Sistemajogodexadrez.bordeGame.Borde;
import Sistemajogodexadrez.bordeGame.Piece;

public class ChessPiece extends Piece {
    
    private Color color;
    
    public ChessPiece(Borde borde, Color color) {
        super(borde);
        this.color = color;
    }

    public Color getColor(){
        return color;
    }
    
}
