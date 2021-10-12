package main.java.td1.refactor.api.general;

public class BurgerAdvisor{

    private static BurgerAdvisor instance= null;

    private BurgerAdvisor(){}

    public static BurgerAdvisor instance(){
        if(instance == null){
            instance =new BurgerAdvisor();
        }
        return  instance;
    }
}
