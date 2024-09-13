package HashCodeEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        User user1 = new User(12, "Master");
        User user2 = new User(12, "Master");

//        List users = new ArrayList<User>();
//        users.add(user1);
//        if(users.contains(user2)){
//            System.out.println("True");
//        }else{
//            System.out.println("False");
//        }

//        System.out.println(user1.hashCode());
//        System.out.println(user2.hashCode());
//---------------------------------------------------

//        HashSet<User> hashSet = new HashSet<User>();
//        hashSet.add(user1);
//        hashSet.add(user2);
//        for (User a : hashSet){
//            System.out.println(a);
//        }

//---------------------------------------------------

        HashMap<User, String> hashMap = new HashMap<>();
        hashMap.put(user1, "MasterFood");

//        user1.setId(15);

        System.out.println(hashMap.get(user1));
    }
}
