package projects.grocery.store.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import static javax.persistence.GenerationType.IDENTITY;
@Entity
@Accessors(chain = true)
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 4, max = 20)
    private String name;

    @Version
    private Long version;
}
