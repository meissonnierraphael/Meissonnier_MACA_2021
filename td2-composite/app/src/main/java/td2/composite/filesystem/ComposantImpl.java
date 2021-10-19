package td2.composite.filesystem;

import java.util.Objects;

public abstract class ComposantImpl implements Composant{

    private String nom;
    private Owner owner;

    public ComposantImpl(String nom, Owner own){
        this.nom=nom;
        this.owner=own;
    }

    public String getName() {
        return this.nom;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(Owner own,boolean recursive) {
        this.owner=own;
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        return false;
    }

    public int hashCode(){
        return Objects.hash(this.getName());
    }
}
