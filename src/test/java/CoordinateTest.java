import org.example.Coordinate;
import org.example.Tile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoordinateTest {
    @Test
    public void testConstructorX () {
        Coordinate testCoordinate = new Coordinate();
        Assertions.assertEquals(0, testCoordinate.getX(),"x should be 0");
    }
    @Test
    public void testConstructorY () {
        Coordinate testCoordinate = new Coordinate();
        Assertions.assertEquals(0, testCoordinate.getY(),"y should be 0");
    }
}

