package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {

        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;

        message = message+444;

        boolean b = message.equals("Hello John Doe");

        boolean c = message.equals("Hello John Doe444");

        String empty1 = new String();
        String empty2 = new String();

        String nothing = empty1.concat(empty2);

        System.out.println(nothing + " " + nothing.length());

        String chars = "Abcde";
        System.out.println(chars.length());
        System.out.println(chars.charAt(0) + "," + chars.charAt(2));
        System.out.println(chars.substring(0,3));

    }

}
