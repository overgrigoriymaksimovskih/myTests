package Interfaces;

public class RobotType3 extends Robot {
    String name;
    public RobotType3(String str) {
        name = str;
    }
    public void standartAction() {
        System.out.println("My name is " + name + " my type " + this.getClass().getSimpleName());
    }
}
