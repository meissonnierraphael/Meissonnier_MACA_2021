package td3.visiteurs.commandes;

import td3.visiteurs.visitors.PrePostVisitor;
import td3.visiteurs.visitors.Visitor;

import java.util.HashMap;
import java.util.Map;

public class Commande implements PrePostVisitable,Visitable{

    private String name;
    private Map<String,Ligne> lignes;

    public Commande(String s){
        this.name=s;
        this.lignes=new HashMap<String,Ligne>();
    }

    public String getName() {
        return name;
    }

    public Map<String, Ligne> getLignes() {
        return lignes;
    }

    public void addLigne(Ligne ligne){
        this.lignes.put(this.name,ligne);
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
