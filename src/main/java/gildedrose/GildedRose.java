package gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    UpdateStrategySelector updateStrategySelector = new UpdateStrategySelector();
    for (Item item : items) {
      updateStrategySelector.select(item).updateSellInAndQuality();
    }
  }

}
