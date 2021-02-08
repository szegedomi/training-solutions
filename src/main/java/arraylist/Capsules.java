package arraylist;


import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> capsules = new ArrayList<>();

    public void addLast(String color){
        this.capsules.add(color);
    }

    public void addFirst(String color){
        this.capsules.add(0, color);
    }

    public void removeLast(){
        this.capsules.remove(capsules.size()-1);
    }

    public void removeFirst(){
        this.capsules.remove(0);
    }

    public List<String> getColors(){
        return this.capsules;
    }

    public static void main(String[] args){
        Capsules capsules = new Capsules();

        capsules.addLast("black");

        capsules.addLast("grey");

        capsules.addFirst("white");
        System.out.println(capsules.getColors().toString());
        capsules.removeFirst();
        System.out.println(capsules.getColors().toString());
        capsules.removeLast();
        System.out.println(capsules.getColors().toString());



    }

}
