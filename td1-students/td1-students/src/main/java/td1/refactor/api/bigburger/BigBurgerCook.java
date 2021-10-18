package main.java.td1.refactor.api.bigburger;

import main.java.td1.refactor.api.general.*;

import java.util.ArrayList;
import java.util.List;

public class BigBurgerCook implements BurgerCook {

    private String nom;
    private List<Product> products;


    public BigBurgerCook(String nom, Size s, MeatType m){
        this.nom = nom;
        double poids;
        switch (s) {
            case SMALL:
                poids = 100;
                break;
            case MEDIUM:
                poids = 200;
                break;
            case BIG:
            default:
                poids = 400;
        }
        this.products = new ArrayList<>();
        this.products.add(new Meat(m, poids));
    }

    @Override
    public Burger cook() {
        return new BigBurgerBurger(nom, products);
    }

    @Override
    public BurgerCook with_cheese() {
        return null;
    }

    @Override
    public BurgerCook with_sauce(SauceType s) {
        return null;
    }

    @Override
    public BurgerCook with_onions() {
        return null;
    }

    @Override
    public BurgerCook with_tomatoes() {
        return null;
    }
}
