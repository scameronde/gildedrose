package gildedrose;

class UpdateStrategySelector {

  public UpdateStrategySelector() {
  }

  public ItemUpdater select(Item item) {
    ItemUpdater itemUpdater;
    if (AgedBrieUpdater.fits(item)) {
      itemUpdater = new AgedBrieUpdater(item);
    }
    else if (BackstagePassUpdater.fits(item)) {
      itemUpdater = new BackstagePassUpdater(item);
    }
    else if (SulfurasUpdater.fits(item)) {
      itemUpdater = new SulfurasUpdater(item);
    }
    else if (ConjuredItemUpdater.fits(item)) {
      itemUpdater = new ConjuredItemUpdater(item);
    }
    else {
      itemUpdater = new RegularItemUpdater(item);
    }
    return itemUpdater;
  }

}
