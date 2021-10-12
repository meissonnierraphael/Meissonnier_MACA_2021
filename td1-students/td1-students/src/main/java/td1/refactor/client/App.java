package main.java.td1.refactor.client;

import main.java.td1.refactor.api.general.BurgerAdvisor;
import main.java.td1.refactor.api.general.Burger;
import main.java.td1.refactor.api.macdeau.MacDeauRestaurant;
import main.java.td1.refactor.api.bigburger.BigBurgerRestaurant;
import static main.java.td1.refactor.api.general.Tariff.*;
import static main.java.td1.refactor.api.general.Size.*;
import static main.java.td1.refactor.api.general.MenuType.*;
import static main.java.td1.refactor.api.general.MeatType.*;
import static main.java.td1.refactor.api.general.SauceType.*;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String args[]) {
        BurgerAdvisor.register(CHEAP, MacDeauRestaurant.queue());
        BurgerAdvisor.register(EXPENSIVE, BigBurgerRestaurant.queue());
        BurgerAdvisor advisor = BurgerAdvisor.instance();
        // A regular burger
        Burger alice_dinner = advisor
                .select(CHEAP)
                .order_menu(FISH_MENU)
                .cook();
        // A burger with extra onions and cheese
        Burger bob_dinner = advisor
                .select(CHEAP)
                .order_menu(MEAT_MENU)
                .with_onions()
                .with_cheese()
                .cook();
        // Cholesterol Burger
        Burger charles_dinner = advisor
                .select(EXPENSIVE)
                .order_personal(BIG, BEEF)
                .with_onions()
                .with_cheese()
                .with_sauce(BARBECUE)
                .with_sauce(BEARNAISE)
                .with_sauce(BURGER)
                .with_cheese()
                .cook();
        List<Burger> dinners = Arrays.asList(
                alice_dinner,
                bob_dinner,
                charles_dinner
        );
        for (Burger dinner : dinners) {
            System.out.println(dinner);
        }
    }
}