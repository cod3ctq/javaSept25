package exceptions;

public class MinimumBalanceExceededException extends RuntimeException {
    public MinimumBalanceExceededException(String message) {
        super(message);
    }
}
