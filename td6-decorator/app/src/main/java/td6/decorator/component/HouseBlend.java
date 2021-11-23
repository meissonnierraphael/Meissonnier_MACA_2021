package td6.decorator.component;

public class HouseBlend extends Beverage{

    public HouseBlend(String descr, double prix){
        this.descritpion=descr;
        this.prix=prix;
    }

    @Override
    public String getDescription() {
        return this.descritpion;
    }

    @Override
    public void cost() {

    }
}
