package Sistemajogodexadrez.ChessLayer.chessPiece;

import Sistemajogodexadrez.ChessLayer.ChessMatch;
import Sistemajogodexadrez.ChessLayer.ChessPiece;
import Sistemajogodexadrez.ChessLayer.Color;
import Sistemajogodexadrez.bordeGame.Borde;
import Sistemajogodexadrez.bordeGame.Position;

public class Pawn extends ChessPiece{

    private ChessMatch chessMatch;
    public Pawn(Borde borde, Color color, ChessMatch chessMatch) {
        super(borde, color);
        this.chessMatch = chessMatch;
        
        
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

            // Special move - En Passant White
            if (position.getLinha() == 3) {
                Position left = new Position(position.getLinha(), position.getColuna() - 1);
                if (getBorde().positionExists(left) && IsThereOpponentPiece(left) && getBorde().pieces(left) == chessMatch.getEnPassantVulnerable()) {
                    mat[left.getLinha() - 1][left.getColuna()] = true;
                }
                Position right = new Position(position.getLinha(), position.getColuna() + 1);
                if (getBorde().positionExists(right) && IsThereOpponentPiece(right) && getBorde().pieces(right) == chessMatch.getEnPassantVulnerable()) {
                    mat[right.getLinha() - 1][right.getColuna()] = true;
                }
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
            // Special move - En Passant Black
               if (position.getLinha() == 4) {
                   Position left = new Position(position.getLinha(), position.getColuna() - 1);
                   if (getBorde().positionExists(left) && IsThereOpponentPiece(left) && getBorde().pieces(left) == chessMatch.getEnPassantVulnerable()) {
                       mat[left.getLinha() + 1][left.getColuna()] = true;
                   }
                   Position right = new Position(position.getLinha(), position.getColuna() + 1);
                   if (getBorde().positionExists(right) && IsThereOpponentPiece(right) && getBorde().pieces(right) == chessMatch.getEnPassantVulnerable()) {
                       mat[right.getLinha() + 1][right.getColuna()] = true;
                   }
                }
            }
        return mat;
    }

    @Override
    public String toString(){
        return "P";
    }
    
}
