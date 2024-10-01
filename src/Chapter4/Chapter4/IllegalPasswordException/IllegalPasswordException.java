package CustomeException.IllegalPasswordException;

public class IllegalPasswordException extends Exception{

    public IllegalPasswordException(){
        super();
    }

    public IllegalPasswordException(String message){
        super("Illegal Password Exception: Check requirements");
    }

}
