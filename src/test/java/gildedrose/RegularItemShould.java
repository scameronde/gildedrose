package gildedrose;

import org.junit.Test;

public class RegularItemShould extends ItemShould {

  @Test
  public void haveItsValueReducedByOneEachDayBeforeSellByDateHasPassed() {
    givenARegularItemWithSellInAndQuality(5, 10);
    whenDayPasses();
    thenTheValueOfItemIs(9);
  }

  @Test
  public void haveItsValueReducedByTwoEachDayAfterSellByDateHasPassed() {
    givenARegularItemWithSellInAndQuality(0, 10);
    whenDayPasses();
    thenTheValueOfItemIs(8);
  }

  @Test
  public void neverHaveItsValueReducedToNegativeBeforeSellByDateHasPassed() {
    givenARegularItemWithSellInAndQuality(5, 0);
    whenDayPasses();
    thenValueOfItemIsNotNegative();
  }

  @Test
  public void neverHaveItsValueReducedToNegativeAfterSellByDateHasPassed() {
    givenARegularItemWithSellInAndQuality(0, 0);
    whenDayPasses();
    thenValueOfItemIsNotNegative();
  }

  @Test
  public void haveItsSellInValueReducedByOneBeforeSellByDateHasPassed() {
    givenARegularItemWithSellInAndQuality(5, 10);
    whenDayPasses();
    thenTheSellInOfItemIs(4);
  }

  @Test
  public void haveItsSellInValueReducedByOneAfterSellByDateHasPassed() {
    givenARegularItemWithSellInAndQuality(0, 10);
    whenDayPasses();
    thenTheSellInOfItemIs(-1);
  }

  private void givenARegularItemWithSellInAndQuality(int sellIn, int quality) {
    givenItemWithNameSellInAndValue("Regular Item", sellIn, quality);
  }

}
