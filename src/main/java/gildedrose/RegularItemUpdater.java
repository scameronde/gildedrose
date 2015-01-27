package gildedrose;

class RegularItemUpdater extends ItemUpdater {

  public RegularItemUpdater(Item item) {
    super(item);
  }

  public void updateSellInAndQuality() {
    if (item.quality > 0) {
      item.quality = item.quality - 1;
    }
    item.sellIn = item.sellIn - 1;
    if (item.sellIn < 0) {
      if (item.quality > 0) {
        item.quality = item.quality - 1;
      }
    }
  }
}
