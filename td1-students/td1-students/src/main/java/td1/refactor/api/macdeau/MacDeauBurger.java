package main.java.td1.refactor.api.macdeau;

import main.java.td1.refactor.api.general.Burger;
import main.java.td1.refactor.api.general.Product;

import java.util.List;

public class MacDeauBurger extends Burger {

    public MacDeauBurger(String nom, List<Product> elmts){
        super(nom,elmts);

    }

    @Override
    public double calories() {
        return 0;
    }

    @Override
    public double calories100g() {
        return 0;
    }
}
