package ship_trip_tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ship_trip.Direction;
import ship_trip.Location;
import ship_trip.Point;
import ship_trip.Ship;

@Test
public class ShipTripTests {
    private Ship ship;

    @BeforeMethod
    public void setUp() {
        ship = new Ship(new Location(new Point(45, 785), Direction.NORTH));
    }

    @Test
    public void testShipLocation() {
        Location location = new Location(new Point(45, 785), Direction.NORTH);
        Assert.assertEquals(ship.getLocation().getDirection().toString(), location.getDirection().toString());
        Assert.assertEquals(ship.getLocation().getPoint().getY(), location.getPoint().getY());
        Assert.assertEquals(ship.getLocation().getPoint().getX(), location.getPoint().getX());

    }

    @Test
    public void testMoveForwardToEastXIncreasesBy10() {
        double pervX = ship.getLocation().getPoint().getX();
        ship.getLocation().setDirection(Direction.EAST);
        ship.moveForward();
        Assert.assertEquals(ship.getLocation().getPoint().getX(), pervX + 10);

    }

    @Test
    public void testMoveForwardToWestXDecreasesBy10() {
        double pervX = ship.getLocation().getPoint().getX();
        ship.getLocation().setDirection(Direction.WEST);
        ship.moveForward();
        Assert.assertEquals(ship.getLocation().getPoint().getX(), pervX - 10);

    }

    @Test
    public void testMoveForwardToNorthYIncreasesBy10() {
        double pervY = ship.getLocation().getPoint().getY();
        ship.getLocation().setDirection(Direction.NORTH);
        ship.moveForward();
        Assert.assertEquals(ship.getLocation().getPoint().getY(), pervY + 10);

    }

    @Test
    public void testMoveForwardToSouthYDecreasesBy10() {
        double pervY = ship.getLocation().getPoint().getY();
        ship.getLocation().setDirection(Direction.SOUTH);
        ship.moveForward();
        Assert.assertEquals(ship.getLocation().getPoint().getY(), pervY - 10);

    }

    @Test
    public void testMoveBackWordToEastXDecreasesBy10() {
        double pervX = ship.getLocation().getPoint().getX();
        ship.getLocation().setDirection(Direction.EAST);
        ship.moveBackward();
        Assert.assertEquals(ship.getLocation().getPoint().getX(), pervX - 10);

    }

    @Test
    public void testMoveBackWordToWestXIncreasesBy10() {
        double pervX = ship.getLocation().getPoint().getX();
        ship.getLocation().setDirection(Direction.WEST);
        ship.moveBackward();
        Assert.assertEquals(ship.getLocation().getPoint().getX(), pervX + 10);

    }

    @Test
    public void testMoveBackWordToNorthYDecreasesBy10() {
        double pervY = ship.getLocation().getPoint().getY();
        ship.getLocation().setDirection(Direction.NORTH);
        ship.moveBackward();
        Assert.assertEquals(ship.getLocation().getPoint().getY(), pervY - 10);

    }

    @Test
    public void testMoveBackWordToSouthYIncreasesBy10() {
        double pervY = ship.getLocation().getPoint().getY();
        ship.getLocation().setDirection(Direction.SOUTH);
        ship.moveBackward();
        Assert.assertEquals(ship.getLocation().getPoint().getY(), pervY + 10);

    }


    @Test
    public void testTurnRightFromEast() {
        ship.getLocation().setDirection(Direction.EAST);
        ship.turnRight();
        Assert.assertEquals(ship.getLocation().getDirection(), Direction.SOUTH);

    }

    @Test
    public void testTurnRightFromSouth() {
        ship.getLocation().setDirection(Direction.SOUTH);
        ship.turnRight();
        Assert.assertEquals(ship.getLocation().getDirection(), Direction.WEST);

    }

    @Test
    public void testTurnRightFromWest() {
        ship.getLocation().setDirection(Direction.WEST);
        ship.turnRight();
        Assert.assertEquals(ship.getLocation().getDirection(), Direction.NORTH);

    }

    @Test
    public void testTurnRightFromNorth() {
        ship.getLocation().setDirection(Direction.NORTH);
        ship.turnRight();
        Assert.assertEquals(ship.getLocation().getDirection(), Direction.EAST);

    }

    @Test
    public void testTurnLeftFromEast() {
        ship.getLocation().setDirection(Direction.EAST);
        ship.turnLeft();
        Assert.assertEquals(ship.getLocation().getDirection(), Direction.NORTH);

    }

    @Test
    public void testTurnLeftFromNorth() {
        ship.getLocation().setDirection(Direction.NORTH);
        ship.turnLeft();
        Assert.assertEquals(ship.getLocation().getDirection(), Direction.WEST);

    }

    @Test
    public void testTurnLeftFromWest() {
        ship.getLocation().setDirection(Direction.WEST);
        ship.turnLeft();
        Assert.assertEquals(ship.getLocation().getDirection(), Direction.SOUTH);

    }

    @Test
    public void testTurnLeftFromSouth() {
        ship.getLocation().setDirection(Direction.SOUTH);
        ship.turnLeft();
        Assert.assertEquals(ship.getLocation().getDirection(), Direction.EAST);

    }


    @AfterMethod
    public void close() {
        ship = null;

    }

}

