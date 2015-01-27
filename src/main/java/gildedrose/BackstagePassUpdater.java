package gildedrose;

class BackstagePassUpdater extends ItemUpdater {

  public BackstagePassUpdater(Item item) {
    super(item);
  }

  static boolean fitesBackstagePass(Item item) {
    return "Backstage passes to a TAFKAL80ETC concert".equals(item.name);
  }

  public void updateSellInAndQuality() {
    if (item.quality < 50) {
      item.quality = item.quality + 1;

      if (item.sellIn < 11) {
        if (item.quality < 50) {
          item.quality = item.quality + 1;
        }
      }

      if (item.sellIn < 6) {
        if (item.quality < 50) {
          item.quality = item.quality + 1;
        }
      }
    }
    item.sellIn = item.sellIn - 1;
    if (item.sellIn < 0) {
      item.quality = item.quality - item.quality;
    }
  }
}
