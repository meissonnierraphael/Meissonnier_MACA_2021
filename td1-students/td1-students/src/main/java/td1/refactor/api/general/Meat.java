package main.java.td1.refactor.api.general;

public class Meat implements Product,CaloriesProduct {

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

    private MeatType type;
    private double weight;

    public Meat(MeatType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double calories100g() {
        return type.calories100g();
    }

    @Override
    public double price() {
        return type.price() * weight / 100;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", type, weight(), price());
    }
}
