package td6.decorator.component;

public class Decaf extends Beverage{

    public Decaf(String descr, double prix){
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
