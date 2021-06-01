package good;
import general.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestThirdGood extends Assert{
    private Point point;

    @Before
    public void init() {point = new Point();}

    @Test(timeout = 1000)
    public void check1b() {
        assertEquals("Есть пробитие", point.chekPenetration(-1.0, -1, 4));
        assertEquals("Есть пробитие", point.chekPenetration(-0.5, -1, 4));
    }
}
