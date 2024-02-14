package exception;

// 사용자 정의 예외
public class BalaceInsufficientException extends Exception {
    public BalaceInsufficientException() {
        super();
    }

    public BalaceInsufficientException(String message) {
        super(message);
    }

}
