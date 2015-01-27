package gildedrose;

class UpdateStrategySelector {

  public UpdateStrategySelector() {
  }

  public ItemUpdater select(Item item) {
    ItemUpdater itemUpdater;
    if (AgedBrieUpdater.fitsAgedBrie(item)) {
      itemUpdater = new AgedBrieUpdater(item);
    }
    else if (BackstagePassUpdater.fitesBackstagePass(item)) {
      itemUpdater = new BackstagePassUpdater(item);
    }
    else if (SulfurasUpdater.fitsSulfuras(item)) {
      itemUpdater = new SulfurasUpdater(item);
    }
    else if (ConjuredItemUpdater.fitsConjuredItems(item)) {
      itemUpdater = new ConjuredItemUpdater(item);
    }
    else {
      itemUpdater = new RegularItemUpdater(item);
    }
    return itemUpdater;
  }

}
