package main.java.td1.refactor.api.general;

public enum SauceType implements  ICalories{
    BURGER, BARBECUE, BEARNAISE;
    // BURGER : 240 kcal / 100g
    // BARBECUE : 130 kcal / 100g
    // BEARNAISE : 550 kcal / 100g

    @Override
    public double calories100g() {
        double cal;
        switch (this){
            case BURGER:
                cal=240;
            case BARBECUE:
                cal=130;
            case BEARNAISE:
            default:
                cal=550;
        }
        return cal;
    }
}
