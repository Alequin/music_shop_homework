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

  public abstract String getDescription();

  public abstract double getTradePrice();

  public abstract double getSellPrice();

}
