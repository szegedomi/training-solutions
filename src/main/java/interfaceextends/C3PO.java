package interfaceextends;

import java.util.ArrayList;
import java.util.List;

public class C3PO implements MoveableRobot{

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public C3PO(Point position) {
        this.position = position;
        this.angle = 0;
    }

    public void moveTo(Point position){
        this.walkTo(position);
    }

    public void fastMoveTo(Point position){
        this.walkTo(position);
    }

    public void rotate(int angle){
        this.angle += angle;
    }

    public List<Point> getPath(){
        return this.path;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    private void walkTo(Point position){
        this.position = position;
        this.path.add(position);
    }


}
