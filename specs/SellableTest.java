import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import shop.Sellable;
import instrument.Guitar;

public class SellableTest{

  private Sellable shopItem;

  @Before
  public void setup(){
    shopItem = new Guitar(6, 100, 300, "Its a guitar");
  }

  @Test
  public void canCalculateMarkup(){
    double expected = 200;
    double result = shopItem.calculateMarkUp();
    assertEquals(expected, result, 0.1); 
  }

}
