package instrument;

public class Guitar extends Instrument{

  private int strings;

  public Guitar(int strings, double tradePrice, double sellPrice, String description){
    super(tradePrice, sellPrice, description, InstrumentType.STRING);
    if(strings < 0){
      throw new IllegalArgumentException(
        "Strings number must be greater than or equal to 0\n" +
        "Strings: " + strings
      );
    }
    this.strings = strings;
  }

  public int getStringsCount(){
    return this.strings;
  }

  public String play(){
    return "strum strum strum";
  }
}
