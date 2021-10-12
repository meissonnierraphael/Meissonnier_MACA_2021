package main.java.td1.refactor.api.general;

public interface BurgerRestaurant {
    BurgerCook order_menu(MenuType m);

    BurgerCook order_personnal(Size s,MenuType m);
}
