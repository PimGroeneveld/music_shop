package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DidgeridooTest {

    Didgeridoo didgeridoo;

    @Before
    public void before(){
        didgeridoo = new Didgeridoo("wind", 50, 150);
    }

    @Test
    public void hasType(){
        assertEquals("wind", didgeridoo.getType());
    }

    @Test
    public void hasPriceBought(){
        assertEquals(50, didgeridoo.getPriceBought(), 0.0);
    }

    @Test
    public void hasPriceSold(){
        assertEquals(150, didgeridoo.getPriceSold(), 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("Hummmm", didgeridoo.play());
    }

    @Test
    public void canGetMarkUpPercentage(){
        assertEquals(200.00, didgeridoo.getMarkUp(), 0.1);
    }

    @Test
    public void canSetMarkUpPrice(){
        assertEquals(75.00, didgeridoo.setMarkUp(1.50), 0.1);
    }

    @Test
    public void canGetProfit(){
        assertEquals(100.00, didgeridoo.getProfit(), 0.0);
    }


}