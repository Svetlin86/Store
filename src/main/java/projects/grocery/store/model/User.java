package projects.grocery.store.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Accessors(chain = true)
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, name = "username")
    private String username;

    @NotEmpty(message = "Please enter your password")
    private String password;

    @ManyToMany(fetch = EAGER)
    private List<Role> roles = new ArrayList<>();

}
