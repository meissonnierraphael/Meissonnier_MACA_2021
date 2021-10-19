package td2.composite.filesystem;

public interface Composant {

    public String getName();
    public Owner getOwner();
    public void setOwner(Owner own, boolean recursive);

    public Integer getSize();
    public String getContent();
    public void appendContent(String content);

    public boolean isComposite();
}
