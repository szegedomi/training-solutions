package stringbuilder;

public class Palindrome {

    public boolean isPalindrome(String word){

        if(isEmpty(word)){
            throw new IllegalArgumentException("Text must not be null!");
        }
        StringBuilder s1 = new StringBuilder(word.toLowerCase());
        StringBuilder s2 = new StringBuilder(word.toLowerCase()).reverse();
        boolean resutl = new StringBuilder(word.toLowerCase()).toString().equals(new StringBuilder(word.toLowerCase()).reverse().toString());
        return new StringBuilder(word.toLowerCase()).toString().equals(new StringBuilder(word.toLowerCase()).reverse().toString());

    }

    private boolean isEmpty(String word){
        return word == null;
    }

}
