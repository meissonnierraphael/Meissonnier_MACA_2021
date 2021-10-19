package td2.composite.filesystem;

public class FSFactory {
    public static FSFactory instance = new FSFactory();

    public static FSFactory getInstance() {
        return instance;
    }

    public FSFactory(){
        
    }

    public Composant createComposant(ComposantType type, String name, Owner owner){
        switch (type) {
            case REPERTOIRE: return new Repertoire(name, owner);
            default: return new Fichier(name, owner);
        }
    }
}
