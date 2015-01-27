package gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (int i = 0; i < items.length; i++) {

			Item item = items[i];
			if (item.name == "Aged Brie") {
				new AgedBrie(item).invoke();
      }
      else if (item.name == "Backstage passes to a TAFKAL80ETC concert") {
				new BackstagePass(item).invoke();
      }
      else if (item.name == "Sulfuras, Hand of Ragnaros") {
				new Sulfuras(item).invoke();
			}
      else {
				new RegularItem(item).invoke();
      }
    }
  }

}
