package Generics.Generics1;

import Generics.Generics1.Car;
import Generics.Generics1.Printer1;
import Generics.Generics1.Printer2;

public class Main {
    public static void main(String[] args) {

        Printer1<Number> printer1a = new Printer1<>();
        Printer1<String> printer1b = new Printer1<>();
        Printer1<Car> printer1c = new Printer1<>();
        Printer2<Car, String> printer2a = new Printer2<>();

        printer1a.addToString(1);
        printer1a.addToString(2);
        printer1a.addToString(3);

        printer1b.addToString("Odin");
        printer1b.addToString("Dva");
        printer1b.addToString("Tri");

        printer1c.addToString(new Car("Toyota", 2023));
        printer1c.addToString(new Car("Volvo", 2000));
        printer1c.addToString(new Car("BMW", 2021));

        printer2a.addToString(new Car("Tesla", 2024), "OHUET");

        System.out.println(printer1a.getString());
        System.out.println(printer1b.getString());
        System.out.println(printer1c.getString());

        System.out.println(printer2a.getString());
    }
}
