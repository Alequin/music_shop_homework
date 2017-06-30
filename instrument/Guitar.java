package instrument;

public class Guitar extends Instrument{

  private int strings;

  public Guitar(int strings, double tradePrice, double sellPrice, String description){
    super(tradePrice, sellPrice, description, InstrumentType.STRING);
    this.strings = strings;
  }

  public String play(){
    return "";
  }

  public double getSellPrice(){
    return 0.0;
  }

  public double getTradePrice(){
    return 0.0;
  }

  public String getDescription(){
    return "";
  }

}
