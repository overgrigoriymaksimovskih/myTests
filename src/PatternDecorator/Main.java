package PatternDecorator;

public class Main {
    public static void main(String[] args) {
        Developer developer = new SeniorJavaDeveloper(new MiddleJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
