import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {
    Bottle bottle = new Bottle();


    @Test
    public void hasDrink(){
        bottle.drink();
        assertEquals(40, bottle.getVolume());
    }

    @Test
    public void hadEmptyDrink(){
        bottle.emptyDrink();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void hasAFullDrink(){
        bottle.fillDrink();
        assertEquals(100, bottle.getVolume());
    }


}
