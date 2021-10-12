package main.java.td1.refactor.api.general;

public interface BurgerCook {
    Burger cook();
    BurgerCook with_cheese();
    BurgerCook with_sauce(SauceType s);
    BurgerCook with_onions();
    BurgerCook with_tomatoes();
}
