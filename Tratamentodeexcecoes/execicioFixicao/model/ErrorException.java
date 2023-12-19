package Tratamentodeexcecoes.execicioFixicao.model;

public class ErrorException extends RuntimeException {
    private static final long serialVersonUID = 1L;

    public ErrorException(String msg){
        super(msg);
    }
}
