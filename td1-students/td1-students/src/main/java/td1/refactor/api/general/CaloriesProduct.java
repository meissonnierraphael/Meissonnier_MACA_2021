package main.java.td1.refactor.api.general;

public interface CaloriesProduct extends ICalories,Product{
    default double calories(){
        return weight()/100 * calories100g();
    }
}
