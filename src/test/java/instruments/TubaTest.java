package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TubaTest {

    Tuba tuba;

    @Before
    public void before(){
        tuba = new Tuba("wind", 150, 240);
    }

    @Test
    public void hasType(){
        assertEquals("wind", tuba.getType());
    }

    @Test
    public void hasPriceBought(){
        assertEquals(150, tuba.getPriceBought(), 0.0);
    }

    @Test
    public void hasPriceSold(){
        assertEquals(240, tuba.getPriceSold(), 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("Tuuut", tuba.play());
    }

    @Test
    public void canGetMarkUpPercentage(){
        assertEquals(60.00, tuba.getMarkUp(), 0.1);
    }

    @Test
    public void canSetMarkUpPrice(){
        assertEquals(225.00, tuba.setMarkUp(1.50), 0.1);
    }

    @Test
    public void canGetProfit(){
        assertEquals(90.00, tuba.getProfit(), 0.0);
    }

}