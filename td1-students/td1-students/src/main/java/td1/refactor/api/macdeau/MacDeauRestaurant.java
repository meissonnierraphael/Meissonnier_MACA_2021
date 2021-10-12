package main.java.td1.refactor.api.macdeau;

import main.java.td1.refactor.api.general.*;

public class MacDeauRestaurant implements BurgerRestaurant {

    private static MacDeauRestaurant instance=null;

    private MacDeauRestaurant(){
    }

    public static BurgerRestaurant queue() {
        if (instance == null) {
            instance = new MacDeauRestaurant();
        }
        return instance;
    }

    @Override
    public BurgerCook order_menu(MenuType m) {
        BurgerCook b;
        switch (m) {
            case MEAT_MENU:
                b = new MacDeauCook("Beefy", Size.MEDIUM, MeatType.BEEF).with_sauce(SauceType.BURGER).with_onions().with_cheese();
                break;
            case FISH_MENU:
                b = new MacDeauCook("Fishy", Size.SMALL, MeatType.WHITEFISH).with_sauce(SauceType.BEARNAISE);
                break;
            case CHEESE_MENU:
            default:
                b = new MacDeauCook("Cheesy", Size.SMALL, MeatType.BEEF).with_cheese();
        }
        return b;
    }

    @Override
    public BurgerCook order_personnal(Size s, MenuType m) {
        return null;
    }
}
