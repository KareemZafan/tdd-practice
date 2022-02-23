package ship_trip;


public class Ship {

    private Location location;

    public Ship() {
    }

    public Ship(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void moveBackward() {
        switch (getLocation().getDirection()) {
            case NORTH:
                location.setPoint(location.getPoint().getX(), location.getPoint().getY() - 10.0);
                break;
            case EAST:
                location.setPoint(location.getPoint().getX() - 10.0, location.getPoint().getY());
                break;
            case WEST:
                location.setPoint(location.getPoint().getX() + 10.0, location.getPoint().getY());
                break;
            case SOUTH:
                location.setPoint(location.getPoint().getX(), location.getPoint().getY() + 10.0);
                break;
            default:
                location.setPoint(location.getPoint().getX(), location.getPoint().getY());
                return;

        }
    }

    public void moveForward() {
        switch (getLocation().getDirection()) {
            case NORTH:
                location.setPoint(location.getPoint().getX(), location.getPoint().getY() + 10.0);
                break;
            case EAST:
                location.setPoint(location.getPoint().getX() + 10.0, location.getPoint().getY());
                break;
            case WEST:
                location.setPoint(location.getPoint().getX() - 10.0, location.getPoint().getY());
                break;
            case SOUTH:
                location.setPoint(location.getPoint().getX(), location.getPoint().getY() - 10.0);
                break;
            default:
                location.setPoint(location.getPoint().getX(), location.getPoint().getY());
                return;

        }
    }

    public void turnRight() {
        switch (getLocation().getDirection()) {
            case NORTH:
                setLocation(new Location(this.getLocation().getPoint(), Direction.EAST));
                break;
            case EAST:
                setLocation(new Location(this.getLocation().getPoint(), Direction.SOUTH));
                break;
            case SOUTH:
                setLocation(new Location(this.getLocation().getPoint(), Direction.WEST));
                break;
            case WEST:
                setLocation(new Location(this.getLocation().getPoint(), Direction.NORTH));
                break;
            default:
                return;


        }
    }

    public void turnLeft() {
        switch (getLocation().getDirection()) {
            case NORTH:
                setLocation(new Location(this.getLocation().getPoint(), Direction.WEST));
                break;
            case EAST:
                setLocation(new Location(this.getLocation().getPoint(), Direction.NORTH));
                break;
            case SOUTH:
                setLocation(new Location(this.getLocation().getPoint(), Direction.EAST));
                break;
            case WEST:
                setLocation(new Location(this.getLocation().getPoint(), Direction.SOUTH));
                break;
            default:
                return;


        }
    }

    @Override
    public String toString() {
        return "Ship{" + "location=" + location + '}';
    }
}
