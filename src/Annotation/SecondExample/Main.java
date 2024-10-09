package Annotation.SecondExample;

public class Main {
    public static void main(String[] args) {
        Class elf = new Elf().getClass();
        Class evilMaster = new EvilMaster().getClass();
        System.out.println(fight(elf, evilMaster));
    }

    public static boolean fight(Class first, Class second)
    {
        if (!first.isAnnotationPresent(Person.class))
            throw new RuntimeException("first param is not game person");
        if (!second.isAnnotationPresent(Person.class))
            throw new RuntimeException("second param is not game person");

        Person firstPerson = (Person) first.getAnnotation(Person.class);
        Person secondPerson = (Person) second.getAnnotation(Person.class);

        int firstAttack = firstPerson.attack() * firstPerson.strength() + firstPerson.magic();
        int firstPower = firstPerson.live() * firstPerson.defense() * firstAttack;

        int secondAttack = secondPerson.attack() * secondPerson.strength() + secondPerson.magic();
        int secondPower = secondPerson.live() * secondPerson.defense() * secondAttack;

        return firstPower > secondPower;
    }
}
