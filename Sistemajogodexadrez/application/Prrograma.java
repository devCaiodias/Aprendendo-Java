package Sistemajogodexadrez.application;

import Sistemajogodexadrez.ChessLayer.ChessMatch;

public class Prrograma {
    public static void main(String[] args) {
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
