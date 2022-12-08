package projects.grocery.store.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Accessors(chain = true)
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Version
    private Long version;

    @Column(unique = true, name = "name")
    @NotEmpty(message = "Please specify the name of the product")
    private String name;

    private BigDecimal price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;

    private int quantity;
}