package PatternStrategy.DuckTypes;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    public Duck() {
    }
    public void fly(){
        flyBehavior.fly();
    }
}
