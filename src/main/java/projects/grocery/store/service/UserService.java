package projects.grocery.store.service;

import projects.grocery.store.model.Role;
import projects.grocery.store.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User getUser(String username);
    List<User> getUsers(); // TODO improve this method  not to return all users;poor performance;
}
