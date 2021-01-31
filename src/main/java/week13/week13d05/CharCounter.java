package week13.week13d05;

public class CharCounter {

    public int charsInAWord(String word){
        int[] isInTheWord = new int[26];
        for(char c = 'a'; c <=  'z' ; c++){
            if(word.contains(String.valueOf(c))){
                isInTheWord[(int) c - 97] = 1;
            }
        }
        int result = 0;
        for(int i = 0; i < 26; i++){
            result += isInTheWord[i];
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(new CharCounter().charsInAWord("zotero"));

    }

}
