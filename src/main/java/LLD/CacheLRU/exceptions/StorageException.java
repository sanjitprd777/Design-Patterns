package LLD.CacheLRU.exceptions;

public class StorageException extends RuntimeException {

    String message;
    String errorCode;

    public StorageException() {
        this.message = "Unknown error";
        this.errorCode = "UK001";
    }

    public StorageException(String message) {
        this.message = message;
    }

    public StorageException(String message, String errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

    public void printExceptionMessage() {
        System.out.println(message + " : " + errorCode);
    }
}
