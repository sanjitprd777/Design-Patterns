package LLD.CacheLRU.algorithms.doublylinkedlist.exception;

public class InvalidElementException extends AlgorithmException {

    public InvalidElementException() {
        super();
    }

    public InvalidElementException(String message) {
        super(message);
    }

    public InvalidElementException(String message, String errorCode) {
        super(message, errorCode);
    }
}
