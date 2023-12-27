package Sistemajogodexadrez.ChessLayer.chessPiece;

import Sistemajogodexadrez.ChessLayer.ChessPiece;
import Sistemajogodexadrez.ChessLayer.Color;
import Sistemajogodexadrez.bordeGame.Borde;
import Sistemajogodexadrez.bordeGame.Position;

public class Bishop extends ChessPiece{

    public Bishop(Borde borde, Color color) {
        super(borde, color);
    }

    @Override
    public String toString(){
        return "B";
    }

    @Override
    public boolean[][] PossibleMoves() {
         boolean[][] mat = new boolean[getBorde().getLinha()][getBorde().getColunas()];

        Position p = new Position(0, 0);

        //nw 
        p.setValues(position.getLinha() - 1 , position.getColuna() - 1);
        while (getBorde().positionExists(p) && !getBorde().ThereIsAPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setValues(p.getLinha() - 1, p.getColuna() - 1);
        }
        if (getBorde().positionExists(p) && IsThereOpponentPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            
        }
        
        // ne
        p.setValues(position.getLinha() - 1 , position.getColuna() + 1);
        while (getBorde().positionExists(p) && !getBorde().ThereIsAPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setValues(p.getLinha() - 1, p.getColuna() + 1);
        }
        if (getBorde().positionExists(p) && IsThereOpponentPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            
        }

        // se
        p.setValues(position.getLinha() + 1 , position.getColuna() + 1);
        while (getBorde().positionExists(p) && !getBorde().ThereIsAPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setValues(p.getLinha() + 1, p.getColuna() + 1);
        }
        if (getBorde().positionExists(p) && IsThereOpponentPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            
        }
        
        // sw 
        p.setValues(position.getLinha() + 1 , position.getColuna() - 1);
        while (getBorde().positionExists(p) && !getBorde().ThereIsAPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setValues(p.getLinha() + 1, p.getColuna() - 1);
        }
        if (getBorde().positionExists(p) && IsThereOpponentPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            
        }
        return mat;
    }
    
}
