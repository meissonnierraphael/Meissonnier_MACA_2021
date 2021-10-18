package main.java.td1.refactor.api.bigburger;

import main.java.td1.refactor.api.general.Burger;
import main.java.td1.refactor.api.general.Product;

import java.util.List;

public class BigBurgerBurger extends Burger {

    public BigBurgerBurger(String name, List<Product> items) {
        super(name, items);
    }

    @Override
    public double calories100g() {
        return 0;
    }
}
