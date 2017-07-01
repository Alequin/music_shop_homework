package musicaccessories;

import shop.Sellable;

public class DrumSticks extends Sellable{

  private int weightInGrams;

  public DrumSticks(int weightInGrams, double tradePrice, double sellPrice, String description){
    super(tradePrice, sellPrice, description);
    if(weightInGrams <= 0){
      throw new IllegalArgumentException(
        "weightInGrams must be greated than 0\n" +
        "weightInGrams: " + weightInGrams
      );
    }
    this.weightInGrams = weightInGrams;
  }

  public int getWeightInGrams(){
    return this.weightInGrams;
  }
}
