import org.example.Tile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TileTest {
    @Test
    public void testConstructor () {
        Tile testTile = new Tile();
        Assertions.assertEquals(false, testTile.getIsMine());
    }
}
