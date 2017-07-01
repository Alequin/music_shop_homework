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

  public int getMaxStockAmount(){
    return this.maxStock;
  }

  public void setMaxStockAmount(int amount){
    this.maxStock = amount;
  }

  public int getStockCount(){
    return stock.size();
  }

  public void addToStock(Sellable item){
    if(getStockCount() + 1 > maxStock){
      throw new IllegalArgumentException(
        "Max stock of this shop is set to 5 items"
      );
    }
    stock.add(item);
  }

  public boolean isInStock(Sellable item){
    return stock.contains(item);
  }
}
