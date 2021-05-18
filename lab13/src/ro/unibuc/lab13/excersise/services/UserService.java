package ro.unibuc.lab13.excersise.services;

import ro.unibuc.lab13.excersise.dto.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class UserService {

    private static UserService userService = new UserService();

    private final List<User> users = new ArrayList<>();

    private UserService() {
        this.init();
    }

    public static UserService getInstance() {
        return userService;
    }

    public Vector<Vector<String>> getAll() {
        Vector<Vector<String>> all = new Vector<>();
        this.users.stream()
                .map(this::map)
                .forEach(all::add);
        return all;
    }

    public User add(User user) {
        this.users.add(user);
        return user;
    }

    public void delete(int index){
        this.users.remove(index);
    }

    private Vector<String> map(User user) {
        Vector<String> vector = new Vector<>();
        vector.add(user.getName());
        vector.add(user.getEmail());
        vector.add(user.isActive() ? "YES" : "NO");
        return vector;
    }

    private void init() {
        User userOne = new User();
        userOne.setName("Ana Maria");
        userOne.setEmail("a.m@gmail.com");
        userOne.setActive(false);
        this.users.add(userOne);

        User userTwo = new User();
        userTwo.setName("Bogdan Maria");
        userTwo.setEmail("bogdan.m@gmail.com");
        userTwo.setActive(true);
        this.users.add(userTwo);

        User userThree = new User();
        userThree.setName("Ana Popescu");
        userThree.setEmail("a.Popescu@gmail.com");
        userThree.setActive(true);
        this.users.add(userThree);

        User userFour = new User();
        userFour.setName("Ana Bogdan");
        userFour.setEmail("a.Bogdan@gmail.com");
        userFour.setActive(true);
        this.users.add(userFour);
    }
}
