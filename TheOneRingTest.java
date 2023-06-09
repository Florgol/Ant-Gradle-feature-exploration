import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The ring embodies the most powerful and ruthless magic, but - or perhaps even for that reason - every once in a while, its math should be checked.
 */
public class TheOneRingTest {

    @Test
    public void testAddNegativeNumbers() {
        TheOneRing ring = new TheOneRing();
        int result = ring.add2Numbers(-2, -3);
        assertEquals(-5, result, "The sum of -2 and -3 should be -5");
    }

    @Test
    public void testAddZero() {
        TheOneRing ring = new TheOneRing();
        int result = ring.add2Numbers(0, 5);
        assertEquals(5, result, "The sum of 0 and 5 should be 5");

        result = ring.add2Numbers(5, 0);
        assertEquals(5, result, "The sum of 5 and 0 should be 5");

        result = ring.add2Numbers(0, 0);
        assertEquals(0, result, "The sum of 0 and 0 should be 0");
    }

    @Test
    public void testAddOverflow() {
        TheOneRing ring = new TheOneRing();
        int result = ring.add2Numbers(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MIN_VALUE, result, "Overflow should wrap around to negative range");
}

}
