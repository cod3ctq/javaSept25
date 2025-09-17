package exceptions;

public class MaximumDailyWithdrawalExceededException extends RuntimeException {
    public MaximumDailyWithdrawalExceededException(String message) {
        super(message);
    }
}
