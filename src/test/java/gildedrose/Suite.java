package gildedrose;

import org.junit.runner.RunWith;

@RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses({
        AgedBrieShould.class,
        BackstagePassesShould.class,
        ConjuredItemShould.class,
        RegularItemShould.class,
        SulfurasShould.class
})

public class Suite {
}
