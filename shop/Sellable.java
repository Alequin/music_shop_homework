package shop;

public abstract class Sellable{

  private String description;
  private double tradePrice;
  private double sellPrice;

  public Sellable(double tradePrice, double sellPrice, String description){
    this.tradePrice = tradePrice;
    this.sellPrice = sellPrice;
    this.description = description;
  }

  public double calculateMarkUp(){
    // Find the difference between
    return 0.0;
  }

  public abstract String getDescription();

  public abstract double getTradePrice();

  public abstract double getSellPrice();

}
