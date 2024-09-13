package Interfaces;

public class RobotType2 extends Robot implements WallBuilder{
    String name;
    public RobotType2(String str) {
        name = str;
    }
    @Override
    public void buildWall() {
        System.out.println("Robot " + name + " is building");
    }
    public void standartAction() {
        System.out.println("My name is " + name + " my type " + Class.class.getName());
    }
}
