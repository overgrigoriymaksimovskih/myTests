package LyambdyAndAnonimusClasses.SecontExample;

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = (a, b) -> Math.max(a, b);
        int res = myFunctionalInterface.findMaxValue(1, 2);
        System.out.println("Результат: " + res);
    }

}
