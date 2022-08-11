package OOP;

public class CustomException extends Exception{
    public CustomException(){
        super("Please don't use digits in the caller name");
    }
}
