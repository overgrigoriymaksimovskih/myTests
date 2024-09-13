package JacksonJSON.Advanced.Serializer;

import JacksonJSON.Advanced.Cat;
import JacksonJSON.Advanced.Dog;
import JacksonJSON.Advanced.ListOfPets;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;

import java.nio.file.Files;

public class Main {
    static Path path = Path.of("D:\\projects\\0000\\MyTests\\src\\JacksonJSON\\Advanced\\Storage\\pets.json");


    public static void main(String[] args) {
        ListOfPets listOfPets = new ListOfPets();
        listOfPets.add(new Cat("Master", 12));
        listOfPets.add(new Cat("Grigoriy", 40));
        listOfPets.add(new Dog("Master", 50, "Alexey"));
        listOfPets.add(new Cat("Food", 16));

        // Создаем объект ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        // Включаем режим вывода даты в формате ISO-8601
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        try (OutputStream outputStream = Files.newOutputStream(path)) {
            objectMapper.writeValue(outputStream, listOfPets);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
