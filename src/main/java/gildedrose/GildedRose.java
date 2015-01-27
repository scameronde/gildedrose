package gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    AbstractItem itemHandler;

    for (int i = 0; i < items.length; i++) {

			Item item = items[i];
			if (item.name == "Aged Brie") {
        itemHandler = new AgedBrie(item);
      }
      else if (item.name == "Backstage passes to a TAFKAL80ETC concert") {
        itemHandler = new BackstagePass(item);
      }
      else if (item.name == "Sulfuras, Hand of Ragnaros") {
        itemHandler = new Sulfuras(item);
      }
      else {
        itemHandler = new RegularItem(item);
      }
      itemHandler.updateSellInAndQuality();
    }
  }

}
