package td3.visiteurs.visitors;

import td3.visiteurs.commandes.Client;
import td3.visiteurs.commandes.Commande;
import td3.visiteurs.commandes.GroupeClient;
import td3.visiteurs.commandes.Ligne;

public class XMLRapportCommandes implements PrePostVisitor{
    @Override
    public void preVisit(GroupeClient groupeClient) {
        System.out.println("<groupe>");
        for(Client c: groupeClient.getClients().values()){
            c.accept((PrePostVisitor) this);
        }
        this.postVisit(groupeClient);
    }

    @Override
    public void preVisit(Client client) {
        System.out.println("<client name="+client+">" );
        for(Commande c: client.getCommandes().values()){
            c.accept((PrePostVisitor) this);
        }
        this.postVisit(client);
    }

    @Override
    public void preVisit(Commande commande) {
        System.out.println("<commande name="+commande+">" );
        for(Ligne l: commande.getLignes().values()){
            l.accept((PrePostVisitor) this);
        }
        this.postVisit(commande);
    }

    @Override
    public void preVisit(Ligne ligne) {
        System.out.println("<ligne name="+ligne+">");
    }

    @Override
    public void postVisit(GroupeClient groupeClient) {
        System.out.println("</groupe>");
    }

    @Override
    public void postVisit(Client client) {
        System.out.println("</client>");
    }

    @Override
    public void postVisit(Commande commande) {
        System.out.println("</commande>");
    }

    @Override
    public void postVisit(Ligne ligne) {
        System.out.println("</ligne>");
    }
}
