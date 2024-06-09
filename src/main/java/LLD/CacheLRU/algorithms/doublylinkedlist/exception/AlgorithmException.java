package LLD.CacheLRU.algorithms.doublylinkedlist.exception;

public class AlgorithmException extends RuntimeException {

    String message;
    String errorCode;

    public AlgorithmException() {
        this.message = "Unknown error";
        this.errorCode = "UK001";
    }

    public AlgorithmException(String message) {
        this.message = message;
    }

    public AlgorithmException(String message, String errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

    public void printExceptionMessage() {
        System.out.println(message + " : " + errorCode);
    }
}
