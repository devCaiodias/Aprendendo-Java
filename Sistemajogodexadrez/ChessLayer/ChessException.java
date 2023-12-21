package Sistemajogodexadrez.ChessLayer;

import Sistemajogodexadrez.bordeGame.BordeException;

public class ChessException extends BordeException {
     private static final long serialVersionUID = 1L;

    public ChessException(String msg){
        super(msg);
    }
}
