package Sistemajogodexadrez.ChessLayer.chessPiece;

import Sistemajogodexadrez.ChessLayer.ChessPiece;
import Sistemajogodexadrez.ChessLayer.Color;
import Sistemajogodexadrez.bordeGame.Borde;
import Sistemajogodexadrez.bordeGame.Position;

public class Pawn extends ChessPiece{

    public Pawn(Borde borde, Color color) {
        super(borde, color);
        
    }

    @Override
    public boolean[][] PossibleMoves() {
        boolean[][] mat = new boolean[getBorde().getLinha()][getBorde().getColunas()];

        Position p = new Position(0, 0);

        if (getColor() == Color.WHITE) {
            p.setValues(position.getLinha() - 1, position.getColuna());
            if (getBorde().positionExists(p)&& !getBorde().ThereIsAPiece(p)) {
                mat[p.getLinha()][p.getColuna()] = true;
            }
            p.setValues(position.getLinha() - 2, position.getColuna());
            Position p2 = new Position(position.getLinha() - 1, position.getColuna());
            if (getBorde().positionExists(p)&& !getBorde().ThereIsAPiece(p) && getBorde().positionExists(p2) && !getBorde().ThereIsAPiece(p2) && getMoveCount() == 0) {
                mat[p.getLinha()][p.getColuna()] = true;
            }
            p.setValues(position.getLinha() - 1, position.getColuna() - 1);
            if (getBorde().positionExists(p) && IsThereOpponentPiece(p)) {
                mat[p.getLinha()][p.getColuna()] = true;
            }
            p.setValues(position.getLinha() - 1, position.getColuna() + 1);
            if (getBorde().positionExists(p) && IsThereOpponentPiece(p)) {
                mat[p.getLinha()][p.getColuna()] = true;
            }
        }
        else{
            p.setValues(position.getLinha() + 1, position.getColuna());
            if (getBorde().positionExists(p)&& !getBorde().ThereIsAPiece(p)) {
                mat[p.getLinha()][p.getColuna()] = true;
            }
            p.setValues(position.getLinha() + 2, position.getColuna());
            Position p2 = new Position(position.getLinha() + 1, position.getColuna());
            if (getBorde().positionExists(p)&& !getBorde().ThereIsAPiece(p) && getBorde().positionExists(p2) && !getBorde().ThereIsAPiece(p2) && getMoveCount() == 0) {
                mat[p.getLinha()][p.getColuna()] = true;
            }
            p.setValues(position.getLinha() + 1, position.getColuna() - 1);
            if (getBorde().positionExists(p) && IsThereOpponentPiece(p)) {
                mat[p.getLinha()][p.getColuna()] = true;
            }
            p.setValues(position.getLinha() + 1, position.getColuna() + 1);
            if (getBorde().positionExists(p) && IsThereOpponentPiece(p)) {
                mat[p.getLinha()][p.getColuna()] = true;
            }
        }

        return mat;
    }

    @Override
    public String toString(){
        return "P";
    }
    
}
