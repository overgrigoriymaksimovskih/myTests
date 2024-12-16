package PatternStrategy;

import PatternStrategy.DuckTypes.Duck;
import PatternStrategy.DuckTypes.NotFlyingDuck;

public class BathDuck extends Duck {
    public BathDuck() {
        flyBehavior = new NotFlyingDuck();
    }
}