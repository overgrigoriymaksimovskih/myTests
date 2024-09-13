package Streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        List<Data.Person> persons = data.getData();

        List<Data.Person> persons2 = (List<Data.Person>) persons.stream()
                .map(person -> data.new Person(30, "Алексей"))
                .collect(Collectors.toList());

        for (int i = 0; i < persons2.size(); i++) {
            System.out.println(persons2.get(i).getName());
        }
    }

}
