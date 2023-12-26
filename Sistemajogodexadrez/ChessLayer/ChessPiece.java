package Sistemajogodexadrez.ChessLayer;

import Sistemajogodexadrez.bordeGame.Borde;
import Sistemajogodexadrez.bordeGame.Piece;
import Sistemajogodexadrez.bordeGame.Position;

public abstract class ChessPiece extends Piece {
    
    private Color color;
    
    public ChessPiece(Borde borde, Color color) {
        super(borde);
        this.color = color;
    }

    public Color getColor(){
        return color;
    }

    public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }

    protected boolean IsThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece)getBorde().pieces(position);
        return p != null && p.getColor() != color;
    }
    
}
