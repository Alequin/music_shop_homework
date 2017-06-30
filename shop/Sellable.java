package shop;

public abstract class Sellable{

  protected String description;
  protected double tradePrice;
  protected double sellPrice;

  public Sellable(double tradePrice, double sellPrice, String description){
    this.tradePrice = tradePrice;
    this.sellPrice = sellPrice;
    this.description = description;
  }

  public double calculateMarkUp(){
    return this.sellPrice - this.tradePrice;
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
