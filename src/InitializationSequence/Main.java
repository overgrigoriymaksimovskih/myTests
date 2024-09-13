package InitializationSequence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Статическая переменная перед созданием объекта: " + Cat.staticValue);

        // Создание объекта
        Cat example = new Cat();

        // Доступ к статической переменной через объект
        System.out.println("Статическая переменная после создания объекта: " + example.staticValue);
    }
}
