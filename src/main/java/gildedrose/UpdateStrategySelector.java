package gildedrose;

class UpdateStrategySelector {

  public UpdateStrategySelector() {
  }

  public ItemUpdater select(Item item) {
    ItemUpdater itemUpdater;
    if (fitsAgedBrie(item)) {
      itemUpdater = new AgedBrieUpdater(item);
    }
    else if (fitesBackstagePass(item)) {
      itemUpdater = new BackstagePassUpdater(item);
    }
    else if (fitsSulfuras(item)) {
      itemUpdater = new SulfurasUpdater(item);
    }
    else if (fitsConjuredItems(item)) {
      itemUpdater = new ConjuredItemUpdater(item);
    }
    else {
      itemUpdater = new RegularItemUpdater(item);
    }
    return itemUpdater;
  }

  private boolean fitsConjuredItems(Item item) {
    return "Conjured Item".equals(item.name);
  }

  private boolean fitsSulfuras(Item item) {
    return "Sulfuras, Hand of Ragnaros".equals(item.name);
  }

  private boolean fitesBackstagePass(Item item) {
    return "Backstage passes to a TAFKAL80ETC concert".equals(item.name);
  }

  private boolean fitsAgedBrie(Item item) {
    return "Aged Brie".equals(item.name);
  }
}
