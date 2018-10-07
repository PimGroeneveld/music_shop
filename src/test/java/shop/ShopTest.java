package shop;

import behaviours.Sellable;
import instruments.Tuba;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Tuba tuba;
    Sellable stock;

    @Before
    public void before(){
        shop = new Shop("Ukelele Paradise");
        tuba = new Tuba("wind", 150, 240);

    }

    @Test
    public void canGetName(){
        assertEquals("Ukelele Paradise", shop.getName());
    }

    @Test
    public void canGetStockCount(){
        shop.add(tuba);
        shop.add(tuba);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canRemoveStockItem(){
        shop.add(tuba);
        shop.add(tuba);
        assertEquals(2, shop.getStockCount());
        shop.removeStockItem();
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canGetTotalProfit(){
        shop.add(tuba);
        shop.add(tuba);
        shop.add(tuba);
        assertEquals(270.00, shop.getTotalProfit(), 0.0);
    }

}