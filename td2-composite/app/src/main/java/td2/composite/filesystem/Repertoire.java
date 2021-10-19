package td2.composite.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Repertoire extends ComposantImpl implements Composant,Composite<Composant>{

    private List<Composant> children;

    public Repertoire(String nom, Owner own) {
        super(nom, own);
        this.children = new ArrayList<>();
    }

    @Override
    public Integer getSize() {
        return this.children.size();
    }

    @Override
    public void setOwner(Owner owner, boolean recursive) {
        super.setOwner(owner, recursive);
        if (recursive== true) {
            this.children.forEach(c -> {
                c.setOwner(owner, recursive);
            });
        }
    }

    @Override
    public String getContent() {
        List<String> maList = new ArrayList<>();
        for(Composant c : this.children){
            maList.add(c.getName()+"\n");
        }
        return maList.toString();
    }

    @Override
    public void appendContent(String content) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public List getChildren() {
        return this.children;
    }

    @Override
    public void addChild(Composant composant) {
        this.children.add(composant);
    }

    @Override
    public boolean removeChild(Composant composant) {
        return this.children.remove(composant);
    }

    @Override
    public boolean removeChildren(List t) {
        return this.children.remove(t);
    }
}
