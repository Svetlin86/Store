package projects.grocery.store.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;
@Entity
@Table(name = "CATEGORY")
@Accessors(chain = true)
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;
}