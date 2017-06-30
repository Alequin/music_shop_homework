package instrument;

import behaviours.Playable;
import shop.Sellable;

public abstract class Instrument extends Sellable implements Playable{

  protected InstrumentType type;

  public Instrument(double tradePrice, double sellPrice, String description, InstrumentType type){
    super(tradePrice, sellPrice, description);
    this.type = type;
  }

}
