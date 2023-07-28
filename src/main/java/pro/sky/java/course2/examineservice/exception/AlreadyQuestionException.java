package pro.sky.java.course2.examineservice.exception;

public class AlreadyQuestionException extends RuntimeException{
    public AlreadyQuestionException() {
    }

    public AlreadyQuestionException(String message) {
        super(message);
    }

    public AlreadyQuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    public AlreadyQuestionException(Throwable cause) {
        super(cause);
    }

    public AlreadyQuestionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
