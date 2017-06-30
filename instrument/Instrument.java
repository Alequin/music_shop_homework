package instrument;

import behaviours.Playable;
import shop.Sellable;

public abstract class Instrument extends Sellable implements Playable{

  private String material;
  private String colour;
  private InstrumentType type;

}
