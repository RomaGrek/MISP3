package bad;
import general.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestThirdBad extends Assert{
    private Point point;

    @Before
    public void init() {point = new Point();}

    @Test(timeout = 1000)
    public void check1b() {
        assertEquals("Нету пробития", point.chekPenetration(-1.0, -1, 2));
        assertEquals("Нету пробития", point.chekPenetration(-1.0, -2, 2));
        assertEquals("Нету пробития", point.chekPenetration(-1.0, -3, 2));
        assertEquals("Нету пробития", point.chekPenetration(-2.0, -1, 2));
        assertEquals("Нету пробития", point.chekPenetration(-3.0, -1, 2));
        assertEquals("Нету пробития", point.chekPenetration(-3.0, -3, 2));
        assertEquals("Нету пробития", point.chekPenetration(-0.1, -1, 2));
    }
}
