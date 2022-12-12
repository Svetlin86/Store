package projects.grocery.store.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projects.grocery.store.model.User;
import projects.grocery.store.service.UserService;
import java.util.List;
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.saveUser(user));
    }
//    @PostMapping
//    public ResponseEntity<Role> saveRole(@RequestBody Role role) {
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .body(userService.saveRole(role));
//    }

//    @PostMapping("/role/addtouser")
//    public ResponseEntity<Role> addRoleToUser(@RequestBody RoleToUserForm form) {
//        userService.addRoleToUser(form.getUsername(), form.getRoleName());
//        return ResponseEntity.ok().build();
//    }
}

