package JacksonJSON.Advanced;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("cat")
public class Cat extends Pet{
    @JsonProperty("age")
    private int age;

    @JsonCreator
    public Cat(@JsonProperty("name")String name, @JsonProperty("age") int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return super.name;
    }
}
