package gildedrose;

class AgedBrieUpdater extends ItemUpdater {

  public AgedBrieUpdater(Item item) {
    super(item);
  }

  static boolean fits(Item item) {
    return "Aged Brie".equals(item.name);
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
