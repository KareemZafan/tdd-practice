package ship_trip;


public class Location {
    private Point point;
    private Direction direction;

    public Location() {
    }

    public Location(Point point, Direction direction) {
        this.point = point;
        this.direction = direction;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setPoint(double x, double y) {
        this.point = new Point(x, y);
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Location{" +
                "point=" + point +
                ", direction=" + direction +
                '}';
    }
}
