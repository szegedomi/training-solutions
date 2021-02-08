package week04.week04d01;

public class NameChanger {

    private String fullName;

    public NameChanger(String fullName) {
        if(fullName == null){
            throw new IllegalArgumentException("Name shell not be null!");
        }
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void changeFirstName(String firstname){
        StringBuilder sb = new StringBuilder();
        sb.append(this.fullName.split(" ")[0]);
        sb.append(" ");
        sb.append(firstname);
        setFullName(sb.toString());
    }

    public static void main(String[] args) {

        NameChanger nc = new NameChanger("Szegedi Domonkos");
        System.out.println(nc.getFullName());
        nc.changeFirstName("Béla");
        System.out.println(nc.getFullName());

    }
}
