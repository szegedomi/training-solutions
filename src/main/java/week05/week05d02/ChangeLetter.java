package week05.week05d02;

class ChangeLetter {

    private final char[] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public String changeVowels(String s) {
        for (char c : vowel) {
            s = s.replace(c, '*');
        }
        return s;
    }


/*    public static void main(String[] args) {
        System.out.println(new Changeletter().changeVowels("Allo world!"));
    }
*/
}

