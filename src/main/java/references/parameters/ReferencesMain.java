package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person person1 = new Person("JD", 28);
        Person person2 = person1;

        person2.setName("DJ");

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person1.getName());
        System.out.println(person2.getName());

        int a =24;
        int b = a;
        b++;

        System.out.println(a);
        System.out.println(b);

    }

}
