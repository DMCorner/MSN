import org.example.Coordinate;
import org.example.Field;
import org.example.Tile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FieldTest {
    @Test
    public void testField () {
        Field testField = new Field(20, 20);
        Assertions.assertEquals(0, testField.mineCount,"A field should start with 0 mineCount");
    }
}