package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OctobassTest {

    Octobass octobass;

    @Before
    public void before(){
        octobass = new Octobass("string", 300, 500);
    }

    @Test
    public void hasType(){
        assertEquals("string", octobass.getType());
    }

    @Test
    public void hasPriceBought(){
        assertEquals(300, octobass.getPriceBought(), 0.0);
    }

    @Test
    public void hasPriceSold(){
        assertEquals(500, octobass.getPriceSold(), 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("Bwammm", octobass.play());
    }

    @Test
    public void canGetMarkUpPercentage(){
        assertEquals(66.66, octobass.getMarkUp(), 0.1);
    }

    @Test
    public void canSetMarkUpPrice(){
        assertEquals(450.00, octobass.setMarkUp(1.50), 0.1);
    }

    @Test
    public void canGetProfit(){
        assertEquals(200.00, octobass.getProfit(), 0.0);
    }

}