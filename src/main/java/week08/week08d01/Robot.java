package week08.week08d01;

public class Robot {

    private Point position;

    public Robot(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public Point move(String moves){
        String steps = moves.toUpperCase();
        for (int i = 0; i < steps.length() ; i++){
            switch (steps.charAt(i)){
                case 'F':
                    position = new Point(position.getX(), position.getY()+1);
                    break;
                case 'L':
                    position = new Point(position.getX(), position.getY()-1);
                    break;
                case 'J':
                    position = new Point(position.getX()+1, position.getY());
                    break;
                case 'B':
                    position = new Point(position.getX()-1, position.getY());
                    break;
                default:
                    throw new IllegalArgumentException("Specified step is invalid!");
            }
        }
        return getPosition();
    }

}
