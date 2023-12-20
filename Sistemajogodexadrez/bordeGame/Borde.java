package Sistemajogodexadrez.bordeGame;

public class Borde {
    private int linhasB;
    private int colunasB;
    private Piece[][] pieces;

    public Borde(){}

    public Borde(int linhas, int colunas){
        this.linhasB = linhas;
        this.colunasB = colunas;
        this.pieces = new Piece[linhas][colunas];
    }

    public int getLinha(){
        return linhasB;
    }

    public void setLinhas(int linhas){
        this.linhasB = linhas;
    }

    public int getColunas(){
        return colunasB;
    }

    public void setColunas(int colunas){
        this.colunasB = colunas;
    }

    public Piece pieces(int linha,int coluna){
        return pieces[linha][coluna];
    }

    public Piece pieces(Position position){
        return pieces[position.getLinha()][position.getColuna()];
    }
}
