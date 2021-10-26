package td3.visiteurs.visitors;

import td3.visiteurs.commandes.Client;
import td3.visiteurs.commandes.Commande;
import td3.visiteurs.commandes.GroupeClient;
import td3.visiteurs.commandes.Ligne;

public class PrintRapportCommandes implements Visitor{

    @Override
    public void visit(GroupeClient groupeClient) {
        groupeClient.accept(this);
    }

    @Override
    public void visit(Client client) {
        client.accept(this);
    }

    @Override
    public void visit(Commande commande) {
        commande.accept(this);
    }

    @Override
    public void visit(Ligne ligne) {
        ligne.accept(this);
    }
}
