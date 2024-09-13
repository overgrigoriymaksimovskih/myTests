package JUnit5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private static Map<Integer, User> allUsers = new HashMap<>();
    private static int countId = 0;

    private int id;
    private String name;

    public User(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;

            if (!hasUser()) {
                countId++;
                this.id = countId;
                allUsers.put(id, this);
            }
        }
    }
    private boolean hasUser(){
        for (User user : allUsers.values()){
            if (user.hashCode() == this.hashCode() && user.equals(this)) {
                return true;
            }
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------
    public static List<User> getAllUsers(){
        return new ArrayList<>(allUsers.values());
    }
}
