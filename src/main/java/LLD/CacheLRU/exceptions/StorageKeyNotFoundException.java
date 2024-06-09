package LLD.CacheLRU.exceptions;

public class StorageKeyNotFoundException extends StorageException {

    public StorageKeyNotFoundException() {
        super();
    }

    public StorageKeyNotFoundException(String message) {
        super(message);
    }

    public StorageKeyNotFoundException(String message, String errorCode) {
        super(message, errorCode);
    }
}
