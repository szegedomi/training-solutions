package abstractclass.gamecharacter;

import java.lang.Math;

public class Point {

    private final long x;
    private final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public double distance(Point point){
        return Math.sqrt((point.getX()-this.x)*(point.getX()-this.x) + (point.getY()-this.y)*(point.getY()-this.y));
    }

}
