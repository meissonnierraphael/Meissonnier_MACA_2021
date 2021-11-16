package td4.state;

public class AmpouleContext {

    private int MAX_USAGE=100;
    private AmpouleState state;
    private int usage;

    public AmpouleContext(){
        this.state=new AmpouleEteinte();
        this.usage=0;
    }

    public void setState(AmpouleState state){
        this.state=state;
    }

    public int getUsage() {
        return usage;
    }

    public void augmentUsage(){
        this.usage++;
    }

    public void setAllumee(){
        this.state.setAllumee(this);
    }

    public void setEteinte(){
        this.state.setEteinte(this);
    }

    public void setCassee(){
        this.state.setCassee(this);
    }
}
