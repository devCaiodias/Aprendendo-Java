package Sistemajogodexadrez.ChessLayer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Sistemajogodexadrez.ChessLayer.chessPiece.King;
import Sistemajogodexadrez.ChessLayer.chessPiece.Rook;
import Sistemajogodexadrez.bordeGame.Borde;
import Sistemajogodexadrez.bordeGame.Piece;
import Sistemajogodexadrez.bordeGame.Position;

public class ChessMatch {

    private int turn;
    private Color currentPlayer;
    private Borde borde;
    private boolean check;
    private boolean checkMate;

    private List<Piece> piecesOnTheBoard = new ArrayList<>();
    private List<Piece> capturedPieces = new ArrayList<>();



    public ChessMatch(){
        borde = new Borde(8, 8);
        turn = 1;
        currentPlayer = Color.WHITE;
        initialSetup();


    }

    public int getTurn(){
        return turn;
    }

    public Color getcurrentPlayer(){
        return currentPlayer;
    }

    public boolean getCheck(){
        return check;
    }

    public boolean getCheckMate(){
        return checkMate;
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

    public boolean[][] possibleMoves(ChessPosition sourcePosition){
        Position position = sourcePosition.toPosition();
        validateSourcePosition(position);
        return borde.pieces(position).PossibleMoves();
    }

    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition){
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();
        validateSourcePosition(source);
        validateTargetPosition(source, target);
        Piece capturedPiece = makeMove(source, target);

        if (testCheck(currentPlayer)) {
            undoMove(source, target, capturedPiece);
            throw new ChessException("You  can't put yourself in check");
        }

        check = (testCheck(opponent(currentPlayer))) ? true : false;

        if (testCheckMate(opponent(currentPlayer))) {
            checkMate = true;
        }else{
            nextTurn();
        }

        return (ChessPiece)capturedPiece;
    }

    private Piece makeMove(Position source, Position target){
        Piece p = borde.removePiece(source);
        Piece capturePiece = borde.removePiece(target);
        borde.placePieces(p, target);

        if (capturePiece != null) {
            piecesOnTheBoard.remove(capturePiece);
            capturedPieces.add(capturePiece);
        }

        return capturePiece;
    }

    private void  undoMove(Position source, Position target, Piece capturedPiece){
        Piece p = borde.removePiece(target);
        borde.placePieces(p, source);

        if (capturedPiece != null)  {
            borde.placePieces(capturedPiece, target);
            capturedPieces.remove(capturedPiece);
            piecesOnTheBoard.add(capturedPiece);
        }
    }

    private void validateSourcePosition(Position position){
        if (!borde.ThereIsAPiece(position)) {
            throw new ChessException("N existir peça na posição de origem");
        }
        if (currentPlayer != ((ChessPiece)borde.pieces(position)).getColor()) {
            throw new ChessException("the chosen piece is not yours");
        }
        if (!borde.pieces(position).IsThereAnyPossibleMove()) {
            throw new ChessException("There is no possible moves for the chosen piece");
        }
    }

    private void validateTargetPosition(Position source, Position target){
        if (!borde.pieces(source).PossibleMove(target)) {
            throw new ChessException("The chosen piece can't move to target position");
        }
    }

    private void nextTurn(){
        turn++;
        currentPlayer = (currentPlayer == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }

    private Color opponent(Color color){
        return (color == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }

    private ChessPiece king(Color color){
        List<Piece> list = piecesOnTheBoard.stream().filter(x -> ((ChessPiece)x).getColor() == color).collect(Collectors.toList());
        for (Piece p : list) {
            if (p instanceof King) {
                return (ChessPiece)p;
            }
        }
        throw new IllegalStateException("there is no " + color + " King on the borde");
    }

    private boolean testCheck(Color color){
        Position kingPosition = king(color).getChessPosition().toPosition();
        List<Piece> oppnentPieces = piecesOnTheBoard.stream().filter(x -> ((ChessPiece)x).getColor() == opponent(color)).collect(Collectors.toList());
        for (Piece p : oppnentPieces) {
            boolean[][] mat = p.PossibleMoves();
            if (mat[kingPosition.getLinha()][kingPosition.getColuna()]) {
                return true;
            }
        }
        return false;
    }


    private boolean testCheckMate(Color color){
        if (!testCheck(color)) {
            return false;
        }
        List<Piece> list = piecesOnTheBoard.stream().filter(x -> ((ChessPiece)x).getColor() == color).collect(Collectors.toList());

        for (Piece p : list) {
            boolean[][] mat = p.PossibleMoves();
            for (int i = 0; i < borde.getLinha(); i++) {
                for (int j = 0; j < borde.getColunas(); j++) {
                    if (mat[i][j]) {
                        Position soucer = ((ChessPiece)p).getChessPosition().toPosition();
                        Position terget = new Position(i, j);
                        Piece capturedPiece = makeMove(soucer, terget);
                        boolean testCheck = testCheck(color);
                        undoMove(soucer, terget, capturedPiece);
                        if (!testCheck) {
                            return false;
                        }
                    }
                }   
            }
         }
        return true;
    }

    private void placeNewPice(char coluna, int linha, ChessPiece piece){
        borde.placePieces(piece, new ChessPosition(coluna, linha).toPosition());
        piecesOnTheBoard.add(piece);
    }

    public void initialSetup(){
        placeNewPice('h', 7, new Rook(borde, Color.WHITE));
        placeNewPice('d', 1, new Rook(borde, Color.WHITE));
        placeNewPice('e', 1, new King(borde, Color.WHITE));

        placeNewPice('b', 8, new Rook(borde, Color.BLACK));
        placeNewPice('a', 8, new King(borde, Color.BLACK)); 
    }

}
