package Sistemajogodexadrez.bordeGame;

public abstract class Piece {
    protected Position position;
    private Borde borde;

    public Piece(Borde borde){
        this.borde = borde;
    }

    protected Borde getBorde(){
        return borde;
    }

    public abstract boolean[][] PossibleMoves();
    

    public boolean PossibleMove(Position position){
        return PossibleMoves()[position.getLinha()][position.getColuna()];
    }

    public boolean IsThereAnyPossibleMove(){
        boolean[][] mat = PossibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
