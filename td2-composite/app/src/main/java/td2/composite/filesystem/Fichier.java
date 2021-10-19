package td2.composite.filesystem;

public class Fichier extends ComposantImpl implements Composant {

    private StringBuilder content;

    public Fichier(String nom, Owner own) {
        super(nom, own);
        content = new StringBuilder();
    }

    @Override
    public Integer getSize() {
        return content.length();
    }

    @Override
    public String getContent() {
        return content.toString();
    }

    @Override
    public void appendContent(String content) {
        this.content.append(content);
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public String toString() {
        return "Fichier{" +
                "content=" + content +
                '}';
    }
}
