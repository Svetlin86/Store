package projects.grocery.store.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RoleController {


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
