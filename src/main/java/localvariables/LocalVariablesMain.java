package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {

        boolean b = false;
        int a = 2;
        int i = 3;
        int j = 4;
        int k = i;

        String s = "Hello World!";
        String t = s;

        {
            int l = 5;
            System.out.println(s);
        }
    }
}
