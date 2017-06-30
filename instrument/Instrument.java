package instrument;

import behaviours.Playable;
import shop.Sellable;

public abstract class Instrument extends Sellable implements Playable{

  private InstrumentType type;

  public Instrument(double tradePrice, double sellPrice, String description, InstrumentType type){
    super(tradePrice, sellPrice, description);
    this.type = type;
  }

  public InstrumentType getType(){
    return this.type;
  }

}
