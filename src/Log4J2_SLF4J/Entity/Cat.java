package Log4J2_SLF4J.Entity;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    void makeSound(){
        System.out.println("Meow");
    }
}