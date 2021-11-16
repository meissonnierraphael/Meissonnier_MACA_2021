package td4.state;

public class AmpouleCassee implements AmpouleState{

    public static AmpouleState state;

    private AmpouleState state(){
        if(state==null){
            state=new AmpouleCassee();
        }
        return state;
    }

    public AmpouleCassee(){

    }

    @Override
    public void setAllumee(AmpouleContext c) {
        c.setState(AmpouleAllumee.state);
    }

    @Override
    public void setEteinte(AmpouleContext c) {
        c.setState(AmpouleEteinte.state);
    }

    @Override
    public void setCassee(AmpouleContext c) {
        c.setState(AmpouleCassee.state);
    }
}
