package Sistemajogodexadrez.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import Sistemajogodexadrez.ChessLayer.ChessException;
import Sistemajogodexadrez.ChessLayer.ChessMatch;
import Sistemajogodexadrez.ChessLayer.ChessPiece;
import Sistemajogodexadrez.ChessLayer.ChessPosition;

public class Prrograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.ReadChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);
                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.ReadChessPosition(sc);
    
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
                
            }
            catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch(InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }

        }
    }
}
