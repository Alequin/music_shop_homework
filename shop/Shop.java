package shop;

import java.util.ArrayList;

public class Shop{

  private int maxStock;
  private ArrayList<Sellable> stock;

  public Shop(int maxStock){
    if(maxStock < 0){
      throw new IllegalArgumentException(
        "Max stock must be greater than or equal to zero\n" +
        "MaxStock: " + maxStock
      );
    }
    this.maxStock = maxStock;
    this.stock = new ArrayList<Sellable>();
  }



}
