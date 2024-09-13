package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(new RobotType1("1111"));
        list.add(new RobotType2("2222"));
        list.add(new RobotType3("3333"));
        list.add(new RobotType4("4444"));

        for (Object o : list){
            if(o instanceof WallBuilder){
                WallBuilder wb = (WallBuilder) o;
                wb.buildWall();
            }else{
                Robot sr = (Robot) o;
                sr.standartAction();
            }
        }
    }
}
