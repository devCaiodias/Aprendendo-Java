package Sistemajogodexadrez.ChessLayer;

import Sistemajogodexadrez.ChessLayer.chessPiece.King;
import Sistemajogodexadrez.ChessLayer.chessPiece.Rook;
import Sistemajogodexadrez.bordeGame.Borde;

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

    private void placeNewPice(char coluna, int linha, ChessPiece piece){
        borde.placePieces(piece, new ChessPosition(coluna, linha).toPosition());
    }

    public void initialSetup(){
        placeNewPice('c', 1, new Rook(borde, Color.WHITE));
        placeNewPice('c', 2, new Rook(borde, Color.WHITE));
        placeNewPice('d', 2, new Rook(borde, Color.WHITE));
        placeNewPice('e', 2, new Rook(borde, Color.WHITE));
        placeNewPice('e', 1, new Rook(borde, Color.WHITE));
        placeNewPice('d', 1, new King(borde, Color.WHITE));

        placeNewPice('c', 7, new Rook(borde, Color.BLACK));
        placeNewPice('c', 8, new Rook(borde, Color.BLACK));
        placeNewPice('d', 7, new Rook(borde, Color.BLACK));
        placeNewPice('e', 7, new Rook(borde, Color.BLACK));
        placeNewPice('e', 8, new Rook(borde, Color.BLACK));
        placeNewPice('d', 8, new King(borde, Color.BLACK));   
    }

}
