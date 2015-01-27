package gildedrose;

class ConjuredItemUpdater extends ItemUpdater {

  public ConjuredItemUpdater(Item item) {
    super(item);
  }

  static boolean fitsConjuredItems(Item item) {
    return "Conjured Item".equals(item.name);
  }

  public void updateSellInAndQuality() {
    if (item.quality > 0) {
      item.quality = item.quality - 2;
    }
    item.sellIn = item.sellIn - 1;
    if (item.sellIn < 0) {
      if (item.quality > 0) {
        item.quality = item.quality - 2;
      }
    }
  }
}
