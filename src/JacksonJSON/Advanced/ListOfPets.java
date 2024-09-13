package JacksonJSON.Advanced;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
import java.util.List;

public class ListOfPets {
    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
    List pets;

    public ListOfPets() {
        this.pets = new ArrayList<>();
    }

    public void add (Pet pet){
        pets.add(pet);
    }

    public ArrayList getArrayList(){
        return  (ArrayList) pets;
    }
}
