package td3.visiteurs.visitors;

import td3.visiteurs.commandes.Client;
import td3.visiteurs.commandes.Commande;
import td3.visiteurs.commandes.GroupeClient;
import td3.visiteurs.commandes.Ligne;

public interface Visitor extends AbstractVisitor{

    void visit(GroupeClient groupeClient);
    void visit(Client client);
    void visit(Commande commande);
    void visit(Ligne ligne);

}
