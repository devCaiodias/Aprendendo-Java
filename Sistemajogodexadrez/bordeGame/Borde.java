package Sistemajogodexadrez.bordeGame;

public class Borde {
    private int linhasB;
    private int colunasB;
    private Piece[][] pieces;

    public Borde(){}

    public Borde(int linhas, int colunas){
        if (linhas < 1 || colunas < 1) {
            throw new BordeException("Erro criando borde: tem que ter pelo menos linha 1 e coluna 1");
        }
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
        if (!positionExists(linha, coluna)) {
            throw new BordeException("Position not on the board");
        }
        return pieces[linha][coluna];
    }

    public Piece pieces(Position position){
        if (!positionExists(position)) {
            throw new BordeException("Position not on the board");
        }
        return pieces[position.getLinha()][position.getColuna()];
    }

    public void placePieces(Piece piece,Position position){
        if (ThereIsAPiece(position)) {
            throw new BordeException("There is already a piece on position " + position);
        }
        this.pieces[position.getLinha()][position.getColuna()] = piece;
        piece.position = position;
    }

    private boolean positionExists(int linhas, int colunas ){
      return linhas >= 0 && linhas < this.linhasB && colunas >= 0 && colunas < this.colunasB;
    }

    public boolean positionExists(Position position){
        return positionExists(position.getLinha(), position.getColuna());
    }

    public boolean ThereIsAPiece(Position position){
        if (!positionExists(position)) {
            throw new BordeException("Position not on the board");
        }
       return pieces(position) != null;
    }
}
