package Sistemajogodexadrez.ChessLayer;

import Sistemajogodexadrez.bordeGame.Position;

public class ChessPosition {
    private char colunas;
    private int linhas;

    public ChessPosition(char colunas, int linhas){
        if (colunas < 'a' || colunas > 'h'|| linhas < 1 || linhas > 8) {
            throw new ChessException("Valores valido de a1 ate h8");
        }
        this.colunas = colunas;
        this.linhas = linhas;
    }

    public char getColuna(){
        return colunas;
    }

    public int getLinha(){
        return linhas;
    }

    protected Position toPosition(){
        return new Position(8 - linhas, colunas - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' - position.getColuna()), 8 - position.getLinha());
    }

    @Override
    public String toString(){
        return "" + colunas + linhas;
    }
}
