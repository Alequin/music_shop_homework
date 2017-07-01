package instrument;

public class Flute extends Instrument{

  private int lengthInCentimeters;
  private boolean openHoles;

  public Flute(int lengthInCentimeters, boolean openHoles,
  double tradePrice, double sellPrice, String description){
    super(tradePrice, sellPrice, description, InstrumentType.WIND);
    if(lengthInCentimeters <= 0){
      throw new IllegalArgumentException(
        "lengthInCentimeters must be greated than 0\n" +
        "lengthInCentimeters: " + lengthInCentimeters
      );
    }
    this.lengthInCentimeters = lengthInCentimeters;
    this.openHoles = openHoles;
  }

  public int getLengthInCentimeters(){
    return this.lengthInCentimeters;
  }

  public boolean isOpenHoles(){
    return this.openHoles;
  }

  public String play(){
    return "whistle whistle";
  }
}
