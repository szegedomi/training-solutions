package attributes.person;

public class Person {

    private String  name;
    private String identificationCard;
    private Address address;

    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public Address getAddress() {
        return address;
    }

    public void movedTo(Address addressTo){
        this.address = addressTo;
    }

    public String personToString(){
        return this.name + ", " + this.identificationCard;
    }

}
