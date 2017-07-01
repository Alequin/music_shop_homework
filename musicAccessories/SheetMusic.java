package musicaccessories;

import shop.Sellable;

public class SheetMusic extends Sellable{

  private String songName;

  public SheetMusic(String songName, double tradePrice, double sellPrice, String description){
    super(tradePrice, sellPrice, description);
    this.songName = songName;
  }

  public String getSongName(){
    return this.songName;
  }
}
