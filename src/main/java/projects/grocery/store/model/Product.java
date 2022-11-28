package projects.grocery.store.model;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Accessors(chain = true)
@Getter
@Setter
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column (unique = true, name = "name")
    @NotEmpty (message = "Please specify the name of the product")
    private String name;

    private BigDecimal price;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "category_id")
    @ToString.Exclude
    private Category category;

    private int quantity;

}
