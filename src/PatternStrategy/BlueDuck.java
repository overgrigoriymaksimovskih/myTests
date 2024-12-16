package PatternStrategy;

import PatternStrategy.DuckTypes.Duck;
import PatternStrategy.DuckTypes.FlyingDuck;

public class BlueDuck extends Duck {
    public BlueDuck() {
        flyBehavior = new FlyingDuck();
    }
}
