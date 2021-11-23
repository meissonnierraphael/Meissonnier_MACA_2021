package td6.decorator.component;

public class Expresso extends Beverage{

    public Expresso(String descr, double prix){
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
