package good;
import general.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestOneGood extends Assert{
    private Point point;

    @Before
    public void init() {point = new Point();}

    @Test(timeout = 1000)
    public void check1b() {
        assertEquals("Есть пробитие", point.chekPenetration(1, 1, 2));
        assertEquals("Есть пробитие", point.chekPenetration(1, 2, 2));
        assertEquals("Есть пробитие", point.chekPenetration(0.5, 1, 2));
        assertEquals("Есть пробитие", point.chekPenetration(0.5, 2, 2));
        assertEquals("Есть пробитие", point.chekPenetration(0.1, 1, 2));
        assertEquals("Есть пробитие", point.chekPenetration(0.1, 2, 2));

        assertEquals("Есть пробитие", point.chekPenetration(1, 1, 4));
        assertEquals("Есть пробитие", point.chekPenetration(1, 2, 4));
        assertEquals("Есть пробитие", point.chekPenetration(1, 4, 4));
        assertEquals("Есть пробитие", point.chekPenetration(0.1, 1, 4));
        assertEquals("Есть пробитие", point.chekPenetration(0.1, 2, 4));
        assertEquals("Есть пробитие", point.chekPenetration(0.1, 4, 4));
        assertEquals("Есть пробитие", point.chekPenetration(1.9, 1, 4));
        assertEquals("Есть пробитие", point.chekPenetration(1.9, 2, 4));
        assertEquals("Есть пробитие", point.chekPenetration(1.9, 4, 4));
        assertEquals("Есть пробитие", point.chekPenetration(2.0, 4, 4));

    }
}
