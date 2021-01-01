package interfaceextends;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot{

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();
    private final static long ALTITUDE = 5;


    public AstroBoy(Point position) {
        this.position = position;
        this.angle = 0;
    }

    public void walkTo(Point position) {
        path.add(position);
        this.position = position;
    }

    public void flyTo(Point position) {
        path.add(position);
        this.position = position;
    }

    public void liftTo(long altitude) {
        Point newPosition = new Point(this.position.getX(), this.position.getY(), altitude);
        path.add(newPosition);
        this.position = newPosition;
    }

    public void moveTo(Point position) {
        walkTo(position);
    }

    public void fastMoveTo(Point position) {
        Point flyingPosition = new Point(position.getX(), position.getY(), ALTITUDE);
        liftTo(ALTITUDE);
        flyTo(flyingPosition);
        liftTo(0);
    }

    public void rotate(int angle) {
        this.angle = angle;
    }

    public List<Point> getPath() {
        return path;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getAltitude() {
        return position.getZ();
    }

}
