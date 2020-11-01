package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {

        Client client = new Client();
        client.setName("John Doe");
        client.setYear(1981);
        client.setAddress("Budapest");

        System.out.println(client.getName() + " born in " + client.getYear() + " lives in " + client.getAddress());

        client.migrate("Szeged");

        System.out.println("Address was changes successfully to " + client.getAddress());

    }
}
