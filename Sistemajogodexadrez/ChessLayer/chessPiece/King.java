package Sistemajogodexadrez.ChessLayer.chessPiece;

import Sistemajogodexadrez.ChessLayer.ChessMatch;
import Sistemajogodexadrez.ChessLayer.ChessPiece;
import Sistemajogodexadrez.ChessLayer.Color;
import Sistemajogodexadrez.bordeGame.Borde;
import Sistemajogodexadrez.bordeGame.Position;

public class King extends ChessPiece {

    private ChessMatch chessMatch;


    public King(Borde borde, Color color, ChessMatch chessMatch) {
        super(borde, color);
        this.chessMatch = chessMatch;
    }

    @Override
    public String toString(){
        return "K";
    }

    private boolean canMoves(Position position){
        ChessPiece p = (ChessPiece)getBorde().pieces(position);
        return p == null || p.getColor() != getColor();
    }

    private boolean testRookCastling(Position position){
        ChessPiece p = (ChessPiece)getBorde().pieces(position);
        return p != null && p instanceof Rook && p .getColor() == getColor() && p.getMoveCount() == 0;
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

        // Special move - Castling
        if (getMoveCount() == 0 && !chessMatch.getCheck()) {
            //Kingside rook
            Position posT1 = new Position(position.getLinha(), position.getColuna() + 3);
            if (testRookCastling(posT1)) {
                Position p1 = new Position(position.getLinha(), position.getColuna() + 1);
                Position p2 = new Position(position.getLinha(), position.getColuna() + 2);
                if (getBorde().pieces(p1) == null && getBorde().pieces(p2) == null) {
                    mat[position.getLinha()][position.getColuna() + 2] = true;
                }
            }
            
            //queenside rook
            Position posT2 = new Position(position.getLinha(), position.getColuna() - 4);
            if (testRookCastling(posT2)) {
                Position p1 = new Position(position.getLinha(), position.getColuna() - 1);
                Position p2 = new Position(position.getLinha(), position.getColuna() - 2);
                Position p3 = new Position(position.getLinha(), position.getColuna() - 3);
                if (getBorde().pieces(p1) == null && getBorde().pieces(p2) == null && getBorde().pieces(p3) == null) {
                    mat[position.getLinha()][position.getColuna() - 2] = true;
                }
            }
        }

        return mat;
    }
    
}
