package JUnit5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    private User user1;
    private User user2;

    //Эти юзеры не должны добавляться (должна быть ошибка если смогут добавиться)
    private User userNotAdd;
    private User userNotAdd1;

    @BeforeEach
    public void setUp() throws Exception {
        user = new User("Pet");
        user1 = new User("Vas");
        user2 = new User("Grish");

        //Эти юзеры не должны добавляться (должна быть ошибка если смогут добавиться)
        userNotAdd = new User("");
        userNotAdd1 = new User(null);
    }

    @Test
    void getAllUsers() {
        List<User> actual = User.getAllUsers();

        List<User> expected = new ArrayList<>();
        expected.add(user);
        expected.add(user1);
        expected.add(user2);

        Assert.assertEquals(expected, actual);
    }
}