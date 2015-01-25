package gildedrose;

import org.junit.Test;

public class SulfurasShould extends ItemShould {

  @Test
  public void neverHaveItsSellInReducedBeforeSellByDateHasPassed() {
    givenASulfurasItemWithSellIn(5);
    whenDayPasses();
    thenTheSellInOfItemIs(5);
  }

  @Test
  public void neverHaveItsSellInReducedAfterSellByDateHasPassed() {
    givenASulfurasItemWithSellIn(0);
    whenDayPasses();
    thenTheSellInOfItemIs(0);
  }

  @Test
  public void neverHaveItsValueReducedBeforeSellByDateHasPassed() {
    givenASulfurasItemWithSellIn(5);
    whenDayPasses();
    thenTheValueOfItemIs(80);
  }

  @Test
  public void neverHaveItsValueReducedAfterSellByDateHasPassed() {
    givenASulfurasItemWithSellIn(0);
    whenDayPasses();
    thenTheValueOfItemIs(80);
  }

  private void givenASulfurasItemWithSellIn(int sellIn) {
    givenItemWithNameSellInAndValue("Sulfuras, Hand of Ragnaros", sellIn, 80);
  }

}
