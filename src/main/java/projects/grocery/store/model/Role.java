package projects.grocery.store.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Accessors(chain = true)
@Getter
@Setter
public class Role {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;

}
