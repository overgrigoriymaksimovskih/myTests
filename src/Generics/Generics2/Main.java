package Generics.Generics2;

public class Main {
    public static void main(String[] args) {
        BodyStandart body = new BodyStandart();

        HeadBurn headBurn = new HeadBurn();
        HeadCanon headCannon = new HeadCanon();
        HeadLaser headLaser = new HeadLaser();

        Leg leg = new Leg();

//        Robot robot0 = new Robot<>(body, leg);

        Robot<BodyStandart, HeadBurn> robot1 = new Robot<> (body, headBurn);
        Robot<BodyStandart, HeadCanon> robot2 = new Robot<>(body, headCannon);
        Robot<BodyStandart, HeadLaser> robot3 = new Robot<>(body, headLaser);

        robot1.getHead().getAbility();
        robot2.getHead().getAbility();
        robot3.getHead().getAbility();
    }

}
