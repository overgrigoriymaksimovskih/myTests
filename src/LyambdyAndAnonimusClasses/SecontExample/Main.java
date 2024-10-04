package LyambdyAndAnonimusClasses.SecontExample;

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = (a, b) -> String.valueOf(Math.max(a, b) + ": max of two values");
        String res = myFunctionalInterface.findMaxValue(1, 2);
        System.out.println("Результат: " + res);
    }

}
