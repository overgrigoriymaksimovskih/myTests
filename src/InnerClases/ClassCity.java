package InnerClases;

import InnerClases.ClassZoo;

public class ClassCity {
    String name;

    public ClassCity(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        ClassCity myCity = new ClassCity("Chelyaninsk");
        ClassZoo myCityZoo = new ClassZoo("celZoo", 300, "Mayor");
        ClassZoo.Lion lion = myCityZoo.new Lion();
        ClassZoo.Tiger tiger = myCityZoo.new Tiger();
        ClassZoo.Donkey donkey = myCityZoo.new Donkey();

        lion.show();
        tiger.show();
        donkey.show();
    }
}
