package gildedrose;

import org.junit.Test;

public class BackstagePassesShould extends ItemShould {
  @Test
  public void increaseInValueByOneIfConcertStartsInMoreThan10Days() {
    givenBackstagePassWithSellInAndQuality(11, 20);
    whenDayPasses();
    thenTheValueOfItemIs(21);
  }

  @Test
  public void neverHaveTheirValueIncreasedBeyond50IfConcertStartsInMoreThan10Days() {
    givenBackstagePassWithSellInAndQuality(11, 50);
    whenDayPasses();
    thenTheValueOfItemIs(50);
  }

  @Test
  public void increaseInValueByTwoIfConcertStartsIn10To5Days() {
    givenBackstagePassWithSellInAndQuality(10, 20);
    whenDayPasses();
    thenTheValueOfItemIs(22);
  }

  @Test
  public void neverHaveTheirValueIncreasedBeyond50IfConcertStartsIn10To5Days() {
    givenBackstagePassWithSellInAndQuality(10, 50);
    whenDayPasses();
    thenTheValueOfItemIs(50);
  }

  @Test
  public void increaseInValueByThreeIfConcertStartsIn5DaysOrLess() {
    givenBackstagePassWithSellInAndQuality(5, 20);
    whenDayPasses();
    thenTheValueOfItemIs(23);
  }

  @Test
  public void neverHaveTheirValueIncreasedBeyond50IfConcertStartsIn5DaysOrLess() {
    givenBackstagePassWithSellInAndQuality(5, 50);
    whenDayPasses();
    thenTheValueOfItemIs(50);
  }

  @Test
  public void haveAValueOfZeroAfterConcertIsOver() {
    givenBackstagePassWithSellInAndQuality(0, 20);
    whenDayPasses();
    thenTheValueOfItemIs(0);
  }

  private void givenBackstagePassWithSellInAndQuality(int sellIn, int quality) {
    givenItemWithNameSellInAndValue("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
  }

}
