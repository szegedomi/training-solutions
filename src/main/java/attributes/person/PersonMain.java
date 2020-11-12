package attributes.person;

public class PersonMain {

    public static void main(String[] args) {

        Person person = new  Person("john doe", "201345hjg");
        Address address = new Address("Hungary", "Bataszek", "Kossuth Lajos utca 71.", "7140");

        person.movedTo(address);

        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

    }
}
