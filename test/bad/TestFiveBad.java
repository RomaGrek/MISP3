package bad;
import general.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestFiveBad extends Assert{
    private Point point;

    @Before
    public void init() {point = new Point();}

    @Test(timeout = 1000)
    public void check1b() {
        assertEquals("Нету пробития", point.chekPenetration(2.1, 0, 2));
        assertEquals("Нету пробития", point.chekPenetration(3.0, 0, 2));
        assertEquals("Нету пробития", point.chekPenetration(-1.1, 0, 2));
        assertEquals("Нету пробития", point.chekPenetration(-3.0, 1, 2));
        assertEquals("Нету пробития", point.chekPenetration(0, 3, 2));
        assertEquals("Нету пробития", point.chekPenetration(0, 4, 2));
        assertEquals("Нету пробития", point.chekPenetration(0, -3, 2));
        assertEquals("Нету пробития", point.chekPenetration(0, -4, 2));
    }
}
