package projects.grocery.store.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @Version
    private Long version;

    private String name;

    @Column(unique = true, name = "username")
    @JsonIgnore
    private String username;

    @NotEmpty(message = "Please enter your password")
    @JsonIgnore
    private String password;

    @ManyToMany(fetch = EAGER)
    private List<Role> roles = new ArrayList<>();

}
