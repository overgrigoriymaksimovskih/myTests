package JacksonJSON.Advanced;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("dog")
public class Dog extends Pet {
    @JsonProperty("age")
    private int age;
    @JsonProperty("owner")
    private String owner;

    @JsonCreator
    public Dog(@JsonProperty("name")String name, @JsonProperty("age")int age, @JsonProperty("owner")String owner) {
        super(name);
        this.age = age;
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        return super.name;
    }
}
