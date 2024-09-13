package JacksonJSON.Advanced.Deserializer;

import JacksonJSON.Advanced.Cat;
import JacksonJSON.Advanced.Dog;
import JacksonJSON.Advanced.ListOfPets;
import JacksonJSON.Advanced.Pet;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Path path = Path.of("D:\\projects\\0000\\MyTests\\src\\JacksonJSON\\Advanced\\Storage\\pets.json");
    static ListOfPets myPets;

    public static void main(String[] args) {

        try (InputStream inputStream = new FileInputStream("D:\\projects\\0000\\MyTests\\src\\JacksonJSON\\Advanced\\Storage\\pets.json")) {
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerSubtypes(Pet.class);
            ListOfPets listOfPets = mapper.readValue(inputStream, ListOfPets.class);
            ArrayList<Pet> pets = listOfPets.getArrayList();
            for (int i = 0; i < pets.size() - 1; i++) {
                if(pets.get(i) instanceof Cat){
                    System.out.println("Im cat " + ((Cat) pets.get(i)).getName() + " " + ((Cat) pets.get(i)).getAge());
                }if((pets.get(i) instanceof Dog)){
                    System.out.println("Im dog " + ((Dog) pets.get(i)).getName() + " " + ((Dog) pets.get(i)).getAge() + " " + ((Dog) pets.get(i)).getOwner());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}