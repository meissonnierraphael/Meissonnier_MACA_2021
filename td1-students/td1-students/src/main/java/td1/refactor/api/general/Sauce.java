package main.java.td1.refactor.api.general;

public class Sauce implements Product,CaloriesProduct {

    public static enum SauceType implements ICalories{
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

    private static double BASE_PRICE = 1;

    private SauceType type;
    private double weight;

    public Sauce(SauceType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double calories100g() {
        return type.calories100g();
    }


    @Override
    public double price() {
        return BASE_PRICE;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s sauce (%.0fg) -- %.2f€", type, weight(), price());
    }
}
