package Sistemajogodexadrez.application;

import java.util.Scanner;

import Sistemajogodexadrez.ChessLayer.ChessMatch;
import Sistemajogodexadrez.ChessLayer.ChessPiece;
import Sistemajogodexadrez.ChessLayer.ChessPosition;

public class Prrograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.ReadChessPosition(sc);
            
            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.ReadChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}
