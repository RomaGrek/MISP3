package good;
import general.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestFourGood extends Assert{
    private Point point;

    @Before
    public void init() {point = new Point();}

    @Test(timeout = 1000)
    public void check1b() {
        assertEquals("Есть пробитие", point.chekPenetration(2.0, -2, 4));
        assertEquals("Есть пробитие", point.chekPenetration(2.0, -3, 4));
        assertEquals("Есть пробитие", point.chekPenetration(2.0, -1, 4));
        assertEquals("Есть пробитие", point.chekPenetration(3.0, -1, 4));
        assertEquals("Есть пробитие", point.chekPenetration(0.1, -1, 4));
        assertEquals("Есть пробитие", point.chekPenetration(0.5, -3, 4));
    }
}
