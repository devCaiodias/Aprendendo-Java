package Sistemajogodexadrez.ChessLayer.chessPiece;

import Sistemajogodexadrez.ChessLayer.ChessPiece;
import Sistemajogodexadrez.ChessLayer.Color;
import Sistemajogodexadrez.bordeGame.Borde;
import Sistemajogodexadrez.bordeGame.Position;

public class King extends ChessPiece {

    public King(Borde borde, Color color) {
        super(borde, color);
    }

    @Override
    public String toString(){
        return "K";
    }

    private boolean canMoves(Position position){
        ChessPiece p = (ChessPiece)getBorde().pieces(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] PossibleMoves() {
        boolean[][] mat = new boolean[getBorde().getLinha()][getBorde().getColunas()];

        Position p = new Position(0, 0);

        //above
        p.setValues(position.getLinha() - 1, position.getColuna());
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            
        }
        
        //below
        p.setValues(position.getLinha() + 1, position.getColuna());
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        
        //Left
        p.setValues(position.getLinha(), position.getColuna() - 1);
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        
        //rigth
        p.setValues(position.getLinha(), position.getColuna() + 1);
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }

        //nw
        p.setValues(position.getLinha() - 1, position.getColuna() - 1);
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        
        //ne
        p.setValues(position.getLinha() - 1, position.getColuna() + 1);
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }

        //sw
        p.setValues(position.getLinha() + 1, position.getColuna() - 1);
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }

         //sw
        p.setValues(position.getLinha() + 1, position.getColuna() + 1);
        if (getBorde().positionExists(p) && canMoves(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }

        return mat;
    }
    
}
