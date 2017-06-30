package instrument;

public class Piano extends Instrument{

  private int keys;
  private int pedals;

  public Piano(int keys, int pedals, double tradePrice, double sellPrice, String description){
    super(tradePrice, sellPrice, description, InstrumentType.PERCUSION);
    if(keys <= 0 || pedals <= 0){
      throw new IllegalArgumentException(
        "Keys and Pedals must be greated than 0\n" +
        "Keys: " + keys + " / Pedals: " + pedals
      );
    }
    this.keys = keys;
    this.pedals = pedals;
  }

  public int getKeysCount(){
    return this.keys;
  }

  public int getPedalsCount(){
    return this.pedals;
  }

  public String play(){
    return "E, D, C, D, E, E, E, D, D, D, E, E, E";
  }
}
