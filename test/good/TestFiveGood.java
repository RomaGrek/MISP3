package good;
import general.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestFiveGood extends Assert {

    private Point point;

    @Before
    public void init() {point = new Point();}

    @Test(timeout = 1000)
    public void check1b() {
        assertEquals("Есть пробитие", point.chekPenetration(0, 4, 4));
        assertEquals("Есть пробитие", point.chekPenetration(0, 2, 4));
        assertEquals("Есть пробитие", point.chekPenetration(0, 0, 4));
        assertEquals("Есть пробитие", point.chekPenetration(0, -2, 4));
        assertEquals("Есть пробитие", point.chekPenetration(0, -4, 4));
        assertEquals("Есть пробитие", point.chekPenetration(4.0, 0, 4));
        assertEquals("Есть пробитие", point.chekPenetration(2.0, 0, 4));
        assertEquals("Есть пробитие", point.chekPenetration(-2.0, 0, 4));
        assertEquals("Есть пробитие", point.chekPenetration(-1.0, 0, 4));
    }
}
