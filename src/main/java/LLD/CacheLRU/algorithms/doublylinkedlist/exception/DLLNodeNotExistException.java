package LLD.CacheLRU.algorithms.doublylinkedlist.exception;

public class DLLNodeNotExistException extends AlgorithmException {

    public DLLNodeNotExistException() {
        super();
    }

    public DLLNodeNotExistException(String message) {
        super(message);
    }

    public DLLNodeNotExistException(String message, String errorCode) {
        super(message, errorCode);
    }
}
