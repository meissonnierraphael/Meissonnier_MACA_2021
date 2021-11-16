package td4.state;

public class AmpouleAllumee implements AmpouleState{

    public static AmpouleState state;

    private AmpouleState state(){
        if(state==null){
            state=new AmpouleAllumee();
        }
        return state;
    }

    public AmpouleAllumee() {
    }

    @Override
    public void setAllumee(AmpouleContext c) {
        System.out.println("Deja Allumée");
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
