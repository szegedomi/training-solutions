package ioreaderclasspath;

public class Country {

    private String name;
    private int neighbours;

    public Country(String name, int neighbours) {
        this.name = name;
        this.neighbours = neighbours;
    }

    public String getName() {
        return name;
    }

    public int getNeighbours() {
        return neighbours;
    }
}
