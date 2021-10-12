package main.java.td1.refactor.api.bigburger;

import main.java.td1.refactor.api.general.BurgerCook;
import main.java.td1.refactor.api.general.BurgerRestaurant;
import main.java.td1.refactor.api.general.MenuType;
import main.java.td1.refactor.api.general.Size;

public class BigBurgerRestaurant implements BurgerRestaurant {
    @Override
    public BurgerCook order_menu(MenuType m) {
        return null;
    }

    @Override
    public BurgerCook order_personnal(Size s, MenuType m) {
        return null;
    }
}
