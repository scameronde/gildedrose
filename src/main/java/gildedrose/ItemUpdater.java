package gildedrose;

public abstract class ItemUpdater {
  protected Item item;

  public ItemUpdater(Item item) {
    this.item = item;
  }

  public abstract void updateSellInAndQuality();
}
