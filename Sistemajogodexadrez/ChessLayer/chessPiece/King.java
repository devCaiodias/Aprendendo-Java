package Sistemajogodexadrez.ChessLayer.chessPiece;

import Sistemajogodexadrez.ChessLayer.ChessPiece;
import Sistemajogodexadrez.ChessLayer.Color;
import Sistemajogodexadrez.bordeGame.Borde;

public class King extends ChessPiece {

    public King(Borde borde, Color color) {
        super(borde, color);
    }

    @Override
    public String toString(){
        return "K";
    }

    @Override
    public boolean[][] PossibleMoves() {
        boolean[][] mat = new boolean[getBorde().getLinha()][getBorde().getColunas()];
        return mat;
    }
    
}
