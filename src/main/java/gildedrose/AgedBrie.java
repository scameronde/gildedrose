package gildedrose;

class AgedBrie extends AbstractItem {

  public AgedBrie(Item item) {
    super(item);
  }

  public void updateSellInAndQuality() {
    if (item.quality < 50) {
      item.quality = item.quality + 1;
    }
    item.sellIn = item.sellIn - 1;
    if (item.sellIn < 0) {
      if (item.quality < 50) {
        item.quality = item.quality + 1;
      }
    }
  }
}
