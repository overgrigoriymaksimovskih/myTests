package PatternStrategy;

import PatternStrategy.DuckTypes.Duck;

public class Main {
    public static void main(String[] args) {
        Duck bathDuck = new BathDuck();
        Duck blueDuck = new BlueDuck();

        bathDuck.fly();
        blueDuck.fly();
    }
}
