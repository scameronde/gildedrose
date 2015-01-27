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

	private class AgedBrie {
		private Item item;

		public AgedBrie(Item item) {
			this.item = item;
		}

		public void invoke() {
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

	private class BackstagePass {
		private Item item;

		public BackstagePass(Item item) {
			this.item = item;
		}

		public void invoke() {
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

	private class Sulfuras {
		private Item item;

		public Sulfuras(Item item) {
			this.item = item;
		}

		public void invoke() {
			if (item.quality > 0) {
      }
		}
	}

	private class RegularItem {
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
}
