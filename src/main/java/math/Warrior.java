package math;

import java.util.Random;

public class Warrior {

    private String name;
    private int stamina;
    private double skill;
    private Point position;

    public Warrior(String name, Point position) {
        this.name = name;
        this.position = position;
        this.stamina = new Random().nextInt(80) + 20;
        this.skill = new Random().nextDouble();
    }

    public Point getPosition() {
        return position;
    }

    public void move(Point point) {
        if (Math.abs(this.position.getX() - point.getX()) > 0 && Math.abs(this.position.getY() - point.getY()) > 0) {
            this.position = new Point(this.position.getX() + (int) ((point.getX() - this.position.getX()) / Math.abs(this.position.getX() - point.getX())), this.position.getY() + (int) ((point.getY() - this.position.getY()) / Math.abs(this.position.getY() - point.getY())));
        } else if (Math.abs(this.position.getX() - point.getX()) > 0) {
            this.position = new Point(this.position.getX() + (int) ((point.getX() - this.position.getX()) / Math.abs(this.position.getX() - point.getX())), this.position.getY());
        }
        else if(Math.abs(this.position.getY() - point.getY()) > 0){
            this.position = new Point(this.position.getX(), this.position.getY() + (int) ((point.getY() - this.position.getY()) / Math.abs(this.position.getY() - point.getY())));
        }
    }

    public double distance(Warrior anotherWarrior){
        return this.position.distance(anotherWarrior.getPosition());
    }

    public void attack(Warrior warrior){

    }

}
