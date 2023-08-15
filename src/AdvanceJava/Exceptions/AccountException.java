package AdvanceJava.Exceptions;

public class AccountException extends Exception{
    public AccountException(Exception cause) {
        super(cause);
    }
}
