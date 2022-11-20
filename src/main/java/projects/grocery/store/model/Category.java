package projects.grocery.store.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Entity
@Accessors(chain = true)
@Getter
@Setter
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column( name = "name")
    private String name;

}
