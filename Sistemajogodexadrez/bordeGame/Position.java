package Sistemajogodexadrez.bordeGame;

public class Position {
    private int linhaP;
    private int colunaP;

    public Position(){}

    public Position(int linha, int coluna){
        this.linhaP = linha;
        this.colunaP = coluna;
    }

    public int getLinha(){
        return linhaP;
    }

    public int getColuna(){
        return colunaP;
    }

    public void setValues(int linha , int coluna){
        this.linhaP = linha;
        this.colunaP = coluna;
    }
    
    @Override
    public String toString(){
        return linhaP + "," + colunaP;
    }
}
