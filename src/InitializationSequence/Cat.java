package InitializationSequence;

public class Cat extends Pet{
    // Статическая переменная
    static String staticValue;

    // Статический блок инициализации
    static {
        System.out.println("Статический блок инициализации выполняется.");
        // Инициализация статической переменной
        staticValue = "111";
    }

    // Конструктор
    public Cat() {
        System.out.println("Конструктор объекта выполняется.");
    }
}
