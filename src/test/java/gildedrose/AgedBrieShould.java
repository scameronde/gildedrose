package gildedrose;

import org.junit.Test;

public class AgedBrieShould extends ItemShould {
  @Test
  public void haveItsValueIncreasedByOneEachDayBeforeSellByDateHasPassed() {
    givenAgedBrieWithSellInAndQuality(5, 10);
    whenDayPasses();
    thenTheValueOfItemIs(11);
  }

  @Test
  public void haveItsValueIncreasedByTwoEachDayAfterSellByDateHasPassed() {
    givenAgedBrieWithSellInAndQuality(0, 10);
    whenDayPasses();
    thenTheValueOfItemIs(12);
  }

  @Test
  public void neverHaveItsValueIncreasedToMoreThan50BeforeSellByDateHasPassed() {
    givenAgedBrieWithSellInAndQuality(5, 50);
    whenDayPasses();
    thenTheValueOfItemIs(50);
  }

  @Test
  public void neverHaveItsValueIncreasedToMoreThan50AfterSellByDateHasPassed() {
    givenAgedBrieWithSellInAndQuality(0, 50);
    whenDayPasses();
    thenTheValueOfItemIs(50);
  }

  @Test
  public void haveItsSellInValueReducedByOneBeforeSellByDateHasPassed() {
    givenAgedBrieWithSellInAndQuality(5, 10);
    whenDayPasses();
    thenTheSellInOfItemIs(4);
  }

  @Test
  public void haveItsSellInValueReducedByOneAfterSellByDateHasPassed() {
    givenAgedBrieWithSellInAndQuality(0, 10);
    whenDayPasses();
    thenTheSellInOfItemIs(-1);
  }

  private void givenAgedBrieWithSellInAndQuality(int sellIn, int quality) {
    givenItemWithNameSellInAndValue("Aged Brie", sellIn, quality);
  }

}
