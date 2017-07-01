import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import shop.*;
import instrument.*;
import musicaccessories.*;

public class ShopTest{

  private Shop shop;
  private Sellable guitar;
  private Sellable piano;
  private Sellable flute;
  private Sellable drumSticks;
  private Sellable sheetMusic;

  @Before
  public void setup(){
    guitar = new Guitar(4, 175, 300, "I'm a guitar");
    flute = new Flute(4, true, 130, 250, "I'm a flute");
    piano = new Piano(35, 3, 290, 450, "I'm a piano");
    drumSticks = new DrumSticks(10, 5, 15, "We are drum sticks");
    sheetMusic = new SheetMusic("Awesome Song", 8, 20, "It's a really awesome song");
    shop = new Shop(5);
  }

  @Test
  public void canGetStockCount(){
    assertEquals(0, shop.getStockCount());
    shop.addToStock(guitar);
    shop.addToStock(sheetMusic);
    assertEquals(2, shop.getStockCount());
  }

  @Test
  public void canAddItemToStockAndCanCheckIfInStock(){
    assertFalse(shop.isInStock(guitar));
    shop.addToStock(guitar);
    assertTrue(shop.isInStock(guitar));
  }
  
  @Test
  public void canGetArrayOfStock(){
    shop.addToStock(guitar);
    shop.addToStock(piano);
    shop.addToStock(flute);
    shop.addToStock(drumSticks);
    shop.addToStock(sheetMusic);
    Sellable[] expected = {guitar, piano, flute, drumSticks, sheetMusic};
    Sellable[] result = shop.getStock();
    assertArrayEquals(expected, result);
  }
}
