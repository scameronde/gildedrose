package gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    ItemUpdater itemUpdater;

    for (int i = 0; i < items.length; i++) {

			Item item = items[i];
			if (item.name == "Aged Brie") {
        itemUpdater = new AgedBrieUpdater(item);
      }
      else if (item.name == "Backstage passes to a TAFKAL80ETC concert") {
        itemUpdater = new BackstagePassUpdater(item);
      }
      else if (item.name == "Sulfuras, Hand of Ragnaros") {
        itemUpdater = new SulfurasUpdater(item);
      }
      else {
        itemUpdater = new RegularItemUpdater(item);
      }
      itemUpdater.updateSellInAndQuality();
    }
  }

}
