package projects.grocery.store.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projects.grocery.store.model.Role;
import projects.grocery.store.model.User;
import projects.grocery.store.service.RoleService;
import projects.grocery.store.service.UserService;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RoleController {
    private final UserService userService;
    private final RoleService roleService;

//    @PostMapping
//    public ResponseEntity<Role> saveRole(@RequestBody Role role) {
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .body(roleService.saveRole(role));
//    }
//
//    @PostMapping("/addtouser")
//    public ResponseEntity<Role> addRoleToUser() {
//        //TODO create method
//        return ResponseEntity.ok().build();
//    }
}
