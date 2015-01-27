package gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    ItemUpdater itemUpdater;

    UpdateStrategySelector updateStrategySelector = new UpdateStrategySelector();
    for (int i = 0; i < items.length; i++) {
      itemUpdater = updateStrategySelector.invoke(items[i]);
      itemUpdater.updateSellInAndQuality();
    }
  }

}
