package gildedrose;

class UpdateStrategySelector {

  public UpdateStrategySelector() {
  }

  public ItemUpdater select(Item item) {
    ItemUpdater itemUpdater;
    if (item.name == "Aged Brie") {
      itemUpdater = new AgedBrieUpdater(item);
    }
    else if (item.name == "Backstage passes to a TAFKAL80ETC concert") {
      itemUpdater = new BackstagePassUpdater(item);
    }
    else if (item.name == "Sulfuras, Hand of Ragnaros") {
      itemUpdater = new SulfurasUpdater(item);
    }
    else if (item.name == "Conjured Item") {
      itemUpdater = new ConjuredItemUpdater(item);
    }
    else {
      itemUpdater = new RegularItemUpdater(item);
    }
    return itemUpdater;
  }
}
