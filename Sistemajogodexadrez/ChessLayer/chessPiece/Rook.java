package Sistemajogodexadrez.ChessLayer.chessPiece;

import Sistemajogodexadrez.ChessLayer.ChessPiece;
import Sistemajogodexadrez.ChessLayer.Color;
import Sistemajogodexadrez.bordeGame.Borde;
import Sistemajogodexadrez.bordeGame.Position;

public class Rook extends ChessPiece {

    public Rook(Borde borde, Color color) {
        super(borde, color);
    }

    @Override
    public String toString(){
        return "R";
    }
    
    @Override
    public boolean[][] PossibleMoves() {
        boolean[][] mat = new boolean[getBorde().getLinha()][getBorde().getColunas()];

        Position p = new Position(0, 0);

        //above 
        p.setValues(position.getLinha() - 1 , position.getColuna());
        while (getBorde().positionExists(p) && !getBorde().ThereIsAPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setLinhaP(p.getLinha() - 1);
        }
        if (getBorde().positionExists(p) && IsThereOpponentPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            
        }
        
        // Left
        p.setValues(position.getLinha() , position.getColuna() - 1);
        while (getBorde().positionExists(p) && !getBorde().ThereIsAPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setColunaP(p.getColuna() - 1);
        }
        if (getBorde().positionExists(p) && IsThereOpponentPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            
        }

        // right
        p.setValues(position.getLinha() , position.getColuna() + 1);
        while (getBorde().positionExists(p) && !getBorde().ThereIsAPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setColunaP(p.getColuna() + 1);
        }
        if (getBorde().positionExists(p) && IsThereOpponentPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            
        }
        
        // below 
        p.setValues(position.getLinha() + 1 , position.getColuna());
        while (getBorde().positionExists(p) && !getBorde().ThereIsAPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setLinhaP(p.getLinha() + 1);
        }
        if (getBorde().positionExists(p) && IsThereOpponentPiece(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            
        }
        return mat;
    }
}
