package td3.visiteurs.commandes;

import td3.visiteurs.visitors.Visitor;

public interface Visitable  {

    void accept(Visitor visitor);
}
