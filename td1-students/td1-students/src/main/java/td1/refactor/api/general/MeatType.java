package main.java.td1.refactor.api.general;

public enum MeatType implements ICalories{
    BEEF, WHITEFISH;
    // BEEF : 200 kcal / 100g
    // WHITEFISH : 170 kcal / 100g
    @Override
    public double calories100g() {
        double cal;
        switch (this){
            case WHITEFISH:
                cal=170;
            case BEEF:
            default:
                cal=200;
        }
        return cal;

    }

    public double price() {
        double rtr;
        switch (this) {
            case WHITEFISH:
                rtr = 6;
                break;
            case BEEF:
            default:
                rtr = 4;
        }
        return rtr;
    }
}
