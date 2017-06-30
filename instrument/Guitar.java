package instrument;

public class Guitar extends Instrument{

  private int strings;

  public Guitar(int strings, double tradePrice, double sellPrice, String description){
    super(tradePrice, sellPrice, description, InstrumentType.STRING);
    this.strings = strings;
  }

  public String play(){
    return "strum strum strum";
  }

  public double getSellPrice(){
    return this.sellPrice;
  }

  public double getTradePrice(){
    return this.tradePrice;
  }

  public String getDescription(){
    return this.description;
  }

}
