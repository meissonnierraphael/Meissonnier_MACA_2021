package main.java.td1.refactor.api.macdeau;

import main.java.td1.refactor.api.general.*;

import java.util.ArrayList;
import java.util.List;

public class MacDeauCook implements BurgerCook {
    private String nom;
    List<Product> produits;

    public MacDeauCook(String string, Size size, MeatType meatType){
        this.nom=string;
        double poids;
        switch (size){
            case SMALL:
                poids=50;
                break;
            case MEDIUM:
                poids=100;
                break;
            case BIG:
            default:
                poids=150;
        }
        this.produits=new ArrayList<>();
        this.produits.add(new Meat(meatType,poids));
    }
    @Override
    public Burger cook() {
        return new MacDeauBurger(nom,produits);
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
