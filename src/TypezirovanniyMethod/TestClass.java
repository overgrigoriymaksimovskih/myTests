package TypezirovanniyMethod;

import java.util.ArrayList;
import java.util.List;

//       Перед типом возвращаемого значения написано <T>, что указывает на дженерик метод. В данном случае метод
//       принимает на вход 2 параметра: список объектов T и еще один отдельный объект Т.
//
//        За счет использования <T> и достигается типизация метода: мы не можем передать туда список строк и число.
//        Список строк и строку, список чисел и число, список наших объектов Cat и еще один объект Cat — только так.
//
//        В методе main() наглядно демонстрируется, что метод fill() легко работает с разными типами данных.
//
//        Сначала он принимает на вход список строк и строку, а потом — список чисел и число.

public class TestClass {

    public static <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++)
            list.set(i, val);
    }

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Старая строка 1");
        strings.add("Старая строка 2");
        strings.add("Старая строка 3");

        fill(strings, "Новая строка");

        System.out.println(strings);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        fill(numbers, 888);
        System.out.println(numbers);
    }
}
