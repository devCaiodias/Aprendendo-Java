package Sistemajogodexadrez.ChessLayer;

import Sistemajogodexadrez.ChessLayer.chessPiece.King;
import Sistemajogodexadrez.ChessLayer.chessPiece.Rook;
import Sistemajogodexadrez.bordeGame.Borde;
import Sistemajogodexadrez.bordeGame.Position;

public class ChessMatch {
    private Borde borde;

    public ChessMatch(){
        borde = new Borde(8, 8);
        initialSetup();

    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[borde.getLinha()][borde.getColunas()];
        for (int i = 0; i < borde.getLinha(); i++) {
            for (int j = 0; j < borde.getColunas(); j++) {
                mat[i][j] = (ChessPiece) borde.pieces(i, j);
            }
        }
        return mat;
    }

    public void initialSetup(){
        borde.placePieces(new Rook(borde, Color.WHITE), new Position(2, 1));
        borde.placePieces(new King(borde, Color.BLACK), new Position(0, 3));    
        borde.placePieces(new King(borde, Color.WHITE), new Position(7, 7));    
    }

}
