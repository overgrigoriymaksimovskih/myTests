package PatternStrategy.DuckTypes;

public class NotFlyingDuck implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
