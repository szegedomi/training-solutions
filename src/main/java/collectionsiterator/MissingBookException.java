package collectionsiterator;

public class MissingBookException extends RuntimeException{

    private String message;

    public MissingBookException(String s) {
        this.message = s;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
