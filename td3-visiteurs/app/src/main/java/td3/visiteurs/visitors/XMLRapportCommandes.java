package td3.visiteurs.visitors;

import td3.visiteurs.commandes.Client;
import td3.visiteurs.commandes.Commande;
import td3.visiteurs.commandes.GroupeClient;
import td3.visiteurs.commandes.Ligne;

public class XMLRapportCommandes implements PrePostVisitor{
    @Override
    public void preVisit(GroupeClient groupeClient) {

    }

    @Override
    public void preVisit(Client client) {

    }

    @Override
    public void preVisit(Commande commande) {

    }

    @Override
    public void preVisit(Ligne ligne) {

    }

    @Override
    public void postVisit(GroupeClient groupeClient) {

    }

    @Override
    public void postVisit(Client client) {

    }

    @Override
    public void postVisit(Commande commande) {

    }

    @Override
    public void postVisit(Ligne ligne) {

    }
}
