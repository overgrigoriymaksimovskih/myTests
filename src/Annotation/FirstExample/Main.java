package Annotation.FirstExample;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Fish[] fishes = new Fish [3];
        fishes[0] = new Pike();
        fishes[1] = new Salmon();
        fishes[2] = new CatFish();

        System.out.println("These fishes cant be catch next months:");
        for (Fish f : fishes){
            var fishClass = f.getClass();
            Fish.FishingBan annotation = fishClass.getAnnotation(Fish.FishingBan.class);
            if (annotation != null){

                System.out.println(fishClass.getSimpleName() + ": ");
                for (Months months : annotation.months()){
                    System.out.println(months);
                }
            }
        }
    }
}
