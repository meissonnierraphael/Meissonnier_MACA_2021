package td4.state;

public class AmpouleEteinte implements AmpouleState {

    public static AmpouleState state;

    private AmpouleState state(){
        if(state==null){
            state=new AmpouleEteinte();
        }
        return state;
    }

    public AmpouleEteinte(){

    }


    @Override
    public void setAllumee(AmpouleContext c) {
        c.augmentUsage();
        c.setState(AmpouleAllumee.state);
    }

    @Override
    public void setEteinte(AmpouleContext c) {

    }

    @Override
    public void setCassee(AmpouleContext c) {
        c.setState(AmpouleCassee.state);
    }
}
