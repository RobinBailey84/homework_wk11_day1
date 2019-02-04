import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(90);
    }

    @Test
    public void hasVolume(){
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void losesVolume(){
        assertEquals(80, waterBottle.drink());
    }

    @Test
    public void finishesDrink(){
        assertEquals(0, waterBottle.finishesDrink());
    }

    @Test
    public void fillsDrink(){
        assertEquals(100, waterBottle.fillsDrink());
    }
}
