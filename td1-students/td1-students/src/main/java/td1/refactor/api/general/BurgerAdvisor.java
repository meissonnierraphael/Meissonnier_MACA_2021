package main.java.td1.refactor.api.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BurgerAdvisor{

    private static BurgerAdvisor instance= null;
    public static Map<Tariff,BurgerRestaurant> registry= new HashMap<>();

    private BurgerAdvisor(){}

    public static BurgerAdvisor instance(){
        if(instance == null){
            instance =new BurgerAdvisor();
        }
        return  instance;
    }

    public static void register(Tariff tariff, BurgerRestaurant b){
        if (registry.containsKey(tariff)==false) {
            registry.put(tariff, b);
        }
    }

    public static BurgerRestaurant select(Tariff t) {
        return registry.get(t);
    }
}
