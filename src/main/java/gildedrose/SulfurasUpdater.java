package gildedrose;

class SulfurasUpdater extends ItemUpdater {

  public SulfurasUpdater(Item item) {
    super(item);
  }

  static boolean fits(Item item) {
    return "Sulfuras, Hand of Ragnaros".equals(item.name);
  }

  public void updateSellInAndQuality() {
    if (item.quality > 0) {
    }
  }
}
