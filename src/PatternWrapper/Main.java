package PatternWrapper;

public class Main {
    public static void main(String[] args)
    {
        Cat cat = new Cat("Васька");
        Cat catWrap = new CatWrapper(cat);

        printName(catWrap);
    }

    public static void printName(Cat cat)
    {
        System.out.println(cat.getName());
    }
}
