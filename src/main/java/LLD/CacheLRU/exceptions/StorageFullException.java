package LLD.CacheLRU.exceptions;

public class StorageFullException extends StorageException {

    public StorageFullException() {
        super();
    }

    public StorageFullException(String message) {
        super(message);
    }

    public StorageFullException(String message, String errorCode) {
        super(message, errorCode);
    }
}
