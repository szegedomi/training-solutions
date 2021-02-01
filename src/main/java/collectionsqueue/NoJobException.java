package collectionsqueue;

public class NoJobException extends RuntimeException{

    private String message;

    public NoJobException(String s) {
        this.message = s;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
