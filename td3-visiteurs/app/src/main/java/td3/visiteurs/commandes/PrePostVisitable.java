package td3.visiteurs.commandes;

import td3.visiteurs.visitors.PrePostVisitor;

public interface PrePostVisitable{

    void accept(PrePostVisitor prePostVisitor);
}


