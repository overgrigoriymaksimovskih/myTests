package Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        String propertiesFilePath = "D:\\projects\\0000\\MyTests\\src\\Properties\\data.properties";

        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(propertiesFilePath)) {
            properties.load(fileInputStream);
        }

        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        double salary = Double.parseDouble(properties.getProperty("salary"));

        Person person = new Person(name, age, salary);
        System.out.println("Объект Person: " + person);
    }
}

class Person {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}