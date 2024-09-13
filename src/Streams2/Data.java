package Streams2;

import java.util.ArrayList;
import java.util.Collections;

public class Data {
    public class Person {
        private int age;
        private String name;

        // Конструктор должен быть публичным, чтобы его можно было использовать вне класса Data
        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    // Список persons должен быть статическим, если вы хотите использовать его в статическом контексте
    public static ArrayList<Person> persons = new ArrayList<>();
    public ArrayList<Person> getData(){
        Data data = new Data();
        // Так как класс Person не статический, мы должны использовать экземпляр класса Data для создания экземпляров Person
        Person person1 = data.new Person(22, "Valeriy");
        Person person2 = data.new Person(23, "Petr");
        Person person3 = data.new Person(24, "Dmitriy");

        // Метод addAll принадлежит классу Collections и должен быть вызван корректно
        Collections.addAll(persons, person1, person2, person3);
        return persons;
    }

//    public static void main(String[] args) {
//        Data data = new Data();
//        // Так как класс Person не статический, мы должны использовать экземпляр класса Data для создания экземпляров Person
//        Person person1 = data.new Person(22, "Valeriy");
//        Person person2 = data.new Person(23, "Petr");
//        Person person3 = data.new Person(24, "Dmitriy");
//
//        // Метод addAll принадлежит классу Collections и должен быть вызван корректно
//        Collections.addAll(persons, person1, person2, person3);
//    }
}