package Streams1;
// Расширенная поддержка потоков в Java 8 реализована с помощью интерфейса Stream<T>. Где T — это тип-параметр,
// обозначающий тип данных, которые передаются в потоке. Другими словами, поток полностью независим от типа данных,
// которые он передает.
//
// Чтобы получить объект-поток у коллекции, достаточно вызвать у нее метод stream().

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static List<Owner> owners;

    private static void initData() {
        final Owner owner1 = new Owner("Олег Малашков");
        owner1.getPets().addAll(List.of(
                new Cat("Барон", Color.BLACK, 3),
                new Cat("Султан", Color.DARK_GREY, 4),
                new Dog("Эльза", Color.WHITE, 0)
        ));

        final Owner owner2 = new Owner("Дмитрий Васильков");
        owner2.getPets().addAll(List.of(
                new Cat("Рыжик", Color.FOXY, 7),
                new Cat("Барсик", Color.FOXY, 5),
                new Parrot("Адмирал", Color.BLUE, 3)
        ));

        final Owner owner3 = new Owner("Наталия Криж");
        owner3.getPets().addAll(List.of(
                new Dog("Арнольд", Color.FOXY, 3),
                new Pig("Пылесос", Color.LIGHT_GREY, 8)
        ));

        final Owner owner4 = new Owner("Павел Мурахов");
        owner4.getPets().addAll(List.of(
                new Snake("Удав", Color.DARK_GREY, 2)
        ));

        final Owner owner5 = new Owner("Антон Федоренко");
        owner5.getPets().addAll(List.of(
                new Cat("Фишер", Color.BLACK, 16),
                new Cat("Зорро", Color.FOXY, 14),
                new Cat("Марго", Color.WHITE, 3),
                new Cat("Забияка", Color.DARK_GREY, 1)
        ));

        owners = List.of(owner1, owner2, owner3, owner4, owner5);
    }

    public static void main(String[] args) {
        initData();
        final List<String> findNames = owners.stream()
                .flatMap(owner -> owner.getPets().stream())
                .filter(pet -> Cat.class.equals(pet.getClass()))
                .filter(cat -> Color.FOXY == cat.getColor())
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .map(Animal::getName)
                .collect(Collectors.toList());
        findNames.forEach(System.out::println);
    }
}
