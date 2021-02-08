package methodpass;

public class Trooper {

    private Position position;
    private String name;

    public Trooper(String name) {
        this.name = name;
        this.position = new Position(0,0);
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void changePosition(Position target){
        this.position = new Position(target.getPosX(),target.getPosY());
    }

    public double distanceFrom(Position target){
        return this.position.distanceFrom(target);
    }

}
