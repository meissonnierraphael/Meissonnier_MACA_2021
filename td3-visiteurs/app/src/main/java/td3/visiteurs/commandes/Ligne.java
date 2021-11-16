package td3.visiteurs.commandes;

import td3.visiteurs.visitors.PrePostVisitor;
import td3.visiteurs.visitors.Visitor;

import java.util.HashMap;
import java.util.Map;

public class Ligne implements PrePostVisitable,Visitable{

    private String name;
    private int num;

    public Ligne(String s){
        this.name=s;
    }

    public Ligne(String s, int i){
        this.name=s;
        this.num=i;

    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
