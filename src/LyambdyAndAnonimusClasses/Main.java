package LyambdyAndAnonimusClasses;

import java.util.ArrayList;
//https://javarush.com/quests/lectures/questsyntaxpro.level18.lecture00
// Основной класс программы
public class Main {

    // Точка входа в программу
    public static void main(String[] args) {
        // Создание списка строк
        ArrayList<String> list = new ArrayList<>();
        // Добавление имен в список
        list.add("Petya");
        list.add("Vasya");
        list.add("Lena");
        list.add("Gosha");
        list.add("Misha");
        list.add("Dasha");
        list.add("Yulia");

        // Строка для поиска в списке
        String myString = "Dasha";

//-----------------------------------------------------------------------------------
        // Реализация интерфейса с анонимным классом
        MyInterface myInterface = new MyInterface() {
            // Метод для поиска индекса элемента в списке
            @Override
            public int find(String obj1, ArrayList<String> obj2) {
                // Перебор элементов списка
                for (int i = 0; i < obj2.size(); i++) {
                    // Получение элемента списка
                    String a = obj2.get(i);
                    // Сравнение элемента с искомой строкой
                    if(a.equals(obj1)){
                        // Возврат индекса найденного элемента
                        return i;
                    }
                }
                // Возврат -1, если элемент не найден
                return -1;
            }
        };

//-----------------------------------------------------------------------------------
        // Реализация интерфейса с лямбда-выражением
        MyInterface myInterface2 = (obj1, obj2 ) -> obj2.indexOf(obj1);

//-----------------------------------------------------------------------------------
        // Стандартная работа с классом
        MyClass.staticMethod();
        MyClass classObject = new MyClass();
        classObject.objectsMethod();

        // Пустая строка для разделения вывода в консоли
        System.out.println("");

//-----------------------------------------------------------------------------------
        // Создание объектов интерфейса с использованием ссылок на методы

        // Вызываем статический метод класса MyClass
        MyInterface2 interfaceObject1 = MyClass::staticMethod;
        interfaceObject1.myInterfaceMethod();
//      Здесь MyClass::staticMethod является ссылкой на статический метод staticMethod класса MyClass.
//      Эта ссылка присваивается переменной interfaceObject1, которая представляет собой объект интерфейса MyInterface2.
//      Когда вызывается interfaceObject1.myInterfaceMethod(), фактически вызывается MyClass.staticMethod().


        // Создаем объект класса MyClass
        MyInterface2 interfaceObject2 = MyClass::new;
        interfaceObject2.myInterfaceMethod();
//      В этом случае MyClass::new является ссылкой на конструктор класса MyClass.
//      Это означает, что при вызове interfaceObject2.myInterfaceMethod() создается новый объект MyClass.

        // Вызываем метод объекта MyClass
        MyInterface2 interfaceObject3 = classObject::objectsMethod;
//        MyInterface2 interfaceObject3 = () -> classObject.objectsMethod();
        interfaceObject3.myInterfaceMethod();
//      Здесь classObject::objectsMethod является ссылкой на нестатический метод objectsMethod объекта classObject класса MyClass.
//      При вызове interfaceObject3.myInterfaceMethod() выполняется метод objectsMethod для classObject.

//----------------------------------------------------------------------------------------------------------------------
        // Вывод результатов поиска в консоль
        System.out.println(myInterface.find(myString, list));
        System.out.println(myInterface2.find(myString, list));
    }
}