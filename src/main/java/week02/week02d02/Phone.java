package week02.week02d02;

public class Phone {

    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {

        Phone phone = new Phone("Nokia", 64);
        System.out.println("This is a " + phone.getType() + " phone with " + phone.getMem() + " GB memory");

    }

}
