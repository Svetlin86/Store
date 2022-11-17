package projects.grocery.store.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import static javax.persistence.GenerationType.AUTO;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column (unique = true) // Prevents items with the same name from being saved in the database
    @NotEmpty (message = "Please specify the name of the product")
    private String name;

    private Double price;

    @Column(nullable = false)
    private String category;

    private int quantity;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", quantity=" + quantity +
                '}';
    }
}
