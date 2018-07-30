package gildedrose;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemShould {
  protected Item item;

  protected void givenItemWithNameSellInAndValue(String name, int sellIn, int value) {
    this.item = new Item(name, sellIn, value);
  }

  protected void whenDayPasses() {
    updateQuality(item);
  }

  protected void thenTheValueOfItemIs(int newValue) {
    assertThat(item.quality, is(equalTo(newValue)));
  }

  protected void thenTheSellInOfItemIs(int newValue) {
    assertThat(item.sellIn, is(equalTo(newValue)));
  }

  protected void thenValueOfItemIsNotNegative() {
    assertThat(item.quality, is(greaterThanOrEqualTo(0)));
  }

  private void updateQuality(Item... items) {
    new GildedRose(items).updateQuality();
  }
}
