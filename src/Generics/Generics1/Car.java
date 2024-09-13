package Generics.Generics1;

public class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car: " + model + " year: " + year;
    }
}
