package td5.strategy.context;

import td5.strategy.strategyA.Deplacement;
import td5.strategy.strategyB.Attaque;

public class Unite {

    private Deplacement deplacement;
    private Attaque attaque;

    public Unite(){
    }

    public void setAttaque(Attaque attaqueStrat) {
        this.attaque = attaqueStrat;
    }

    public void setDeplacement(Deplacement deplacementStrat) {
        this.deplacement = deplacementStrat;
    }

    public void seDeplacer(){
        deplacement.seDeplacer();
    }

    public void attaquer(){
        attaque.attaquer();
    }
}
