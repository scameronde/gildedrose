package gildedrose;

import org.junit.Test;

public class ConjuredItemShould extends ItemShould {

  @Test
  public void haveItsValueReducedByTwoEachDayBeforeSellByDateHasPassed() {
    givenAConjuredItemWithSellInAndQuality(5, 10);
    whenDayPasses();
    thenTheValueOfItemIs(8);
  }

  @Test
  public void haveItsValueReducedByFourEachDayAfterSellByDateHasPassed() {
    givenAConjuredItemWithSellInAndQuality(0, 10);
    whenDayPasses();
    thenTheValueOfItemIs(6);
  }

  @Test
  public void neverHaveItsValueReducedToNegativeBeforeSellByDateHasPassed() {
    givenAConjuredItemWithSellInAndQuality(5, 0);
    whenDayPasses();
    thenValueOfItemIsNotNegative();
  }

  @Test
  public void neverHaveItsValueReducedToNegativeAfterSellByDateHasPassed() {
    givenAConjuredItemWithSellInAndQuality(0, 0);
    whenDayPasses();
    thenValueOfItemIsNotNegative();
  }

  @Test
  public void haveItsSellInValueReducedByOneBeforeSellByDateHasPassed() {
    givenAConjuredItemWithSellInAndQuality(5, 10);
    whenDayPasses();
    thenTheSellInOfItemIs(4);
  }

  @Test
  public void haveItsSellInValueReducedByOneAfterSellByDateHasPassed() {
    givenAConjuredItemWithSellInAndQuality(0, 10);
    whenDayPasses();
    thenTheSellInOfItemIs(-1);
  }

  private void givenAConjuredItemWithSellInAndQuality(int sellIn, int quality) {
    givenItemWithNameSellInAndValue("Conjured Item", sellIn, quality);
  }

}
