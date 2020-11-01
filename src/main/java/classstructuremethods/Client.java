package classstructuremethods;

public class Client {

    private String name; //name of the client
    private int year; //year of birth of the client
    private String address; //address of the client

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void migrate(String newAddress){
        this.setAddress(newAddress);
    }
}
