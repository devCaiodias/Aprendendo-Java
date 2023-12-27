package Sistemajogodexadrez.ChessLayer.chessPiece;

import Sistemajogodexadrez.ChessLayer.ChessPiece;
import Sistemajogodexadrez.ChessLayer.Color;
import Sistemajogodexadrez.bordeGame.Borde;
import Sistemajogodexadrez.bordeGame.Position;

public class Knight extends ChessPiece {

    public Knight(Borde borde, Color color) {
        super(borde, color);
    }

    @Override
    public String toString(){
        return "N";
    }

    @Override
    public boolean[][] PossibleMoves() {
        boolean[][] mat = new boolean[getBorde().getLinha()][getBorde().getColunas()];

        Position p = new Position(0, 0);

        p.setValues(position.getLinha() - 1, position.getColuna() - 2);
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            
        }
        
        p.setValues(position.getLinha() - 2, position.getColuna() - 1);
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }
    
        p.setValues(position.getLinha() - 2, position.getColuna() + 1);
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        
        p.setValues(position.getLinha() - 1, position.getColuna() + 2);
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }


        p.setValues(position.getLinha() + 1, position.getColuna()  + 2);
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        

        p.setValues(position.getLinha() + 2 , position.getColuna() + 1);
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }

        
        p.setValues(position.getLinha() + 2, position.getColuna() - 1);
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValues(position.getLinha() + 1, position.getColuna() - 2);
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }

        return mat;
    }

    private boolean canMoves(Position position){
        ChessPiece p = (ChessPiece)getBorde().pieces(position);
        return p == null || p.getColor() != getColor();
    }

    
    
}
