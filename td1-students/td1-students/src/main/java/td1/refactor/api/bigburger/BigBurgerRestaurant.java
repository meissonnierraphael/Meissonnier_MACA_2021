package main.java.td1.refactor.api.bigburger;

import main.java.td1.refactor.api.general.*;

public class BigBurgerRestaurant implements BurgerRestaurant {
    private static BigBurgerRestaurant instance = null;

    public BigBurgerRestaurant(){

    }

    public static BurgerRestaurant queue() {
        if (instance == null) {
            instance = new BigBurgerRestaurant();
        }
        return instance;
    }

    @Override
    public BurgerCook order_menu(MenuType m) {
        return null;
    }

    @Override
    public BurgerCook order_personnal(Size s, MeatType m) {
        return new BigBurgerCook("Perso", s, m);;
    }
}
