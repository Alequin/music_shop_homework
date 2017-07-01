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

  }

  @Test
  public void canAddItemToStockCount(){

  }

  @Test
  public void canGetArrayOfStock(){
    
  }
}
