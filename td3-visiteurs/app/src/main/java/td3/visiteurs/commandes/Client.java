package td3.visiteurs.commandes;

import td3.visiteurs.exceptions.MonException;
import td3.visiteurs.visitors.PrePostVisitor;
import td3.visiteurs.visitors.Visitor;

import java.util.HashMap;
import java.util.Map;

public class Client implements PrePostVisitable,Visitable{

    private String name;
    private Map<String,Commande> commandes;

    public Client(String s){
        this.name=s;
        this.commandes=new HashMap<String,Commande>();
    }

    public String getName() {
        return name;
    }

    public void addCommande(Commande commande) {
        this.commandes.put(commande.getName(),commande);
    }

    public void addLigne(String s, Ligne ligne) throws MonException{
        Commande tmp = this.commandes.get(s);
        if(tmp != null){
            tmp.addLigne(ligne);
        }
        else throw new MonException("La commande n'existe pas");
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        prePostVisitor.postVisit(this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
