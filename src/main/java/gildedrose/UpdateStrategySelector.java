package gildedrose;

class UpdateStrategySelector {

  public UpdateStrategySelector() {
  }

  public ItemUpdater select(Item item) {
    ItemUpdater itemUpdater;
    if ("Aged Brie".equals(item.name)) {
      itemUpdater = new AgedBrieUpdater(item);
    }
    else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
      itemUpdater = new BackstagePassUpdater(item);
    }
    else if ("Sulfuras, Hand of Ragnaros".equals(item.name)) {
      itemUpdater = new SulfurasUpdater(item);
    }
    else if ("Conjured Item".equals(item.name)) {
      itemUpdater = new ConjuredItemUpdater(item);
    }
    else {
      itemUpdater = new RegularItemUpdater(item);
    }
    return itemUpdater;
  }
}
