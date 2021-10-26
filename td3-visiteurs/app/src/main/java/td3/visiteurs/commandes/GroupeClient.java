package td3.visiteurs.commandes;

import td3.visiteurs.exceptions.MonException;
import td3.visiteurs.visitors.PrePostVisitor;
import td3.visiteurs.visitors.Visitor;

import java.util.HashMap;
import java.util.Map;

public class GroupeClient implements PrePostVisitable,Visitable{

    private String name;
    private Map<String, Client> clients;

    public GroupeClient(String s){
        this.name=s;
        this.clients=new HashMap<String,Client>();
    }

    public void addClient(Client client){
        this.clients.put(client.getName() ,client);
    }

    public void addCommande(String s, Commande commande) throws MonException{
        Client tmp =clients.get(s);
        if(tmp != null){
            tmp.addCommande(commande);
        }
        else throw new MonException("Impossible d'ajouter la commande");

    }

    public void addLigne(String s1, String s2, Ligne ligne) throws MonException {
        Client tmp = clients.get(s1);
        if(tmp != null){
            tmp.addLigne(s2,ligne);
        }
        else throw new MonException("Erreur dans l'ajout de la ligne");
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
