package PatternStrategy.DuckTypes;

public class FlyingDuck implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
