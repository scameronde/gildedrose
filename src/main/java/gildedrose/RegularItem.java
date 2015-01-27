package gildedrose;

class RegularItem {
  private Item item;

  public RegularItem(Item item) {
    this.item = item;
  }

  public void invoke() {
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
