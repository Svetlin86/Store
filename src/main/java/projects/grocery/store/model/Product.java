package projects.grocery.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import projects.grocery.store.enumertaion.Quantity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;


@Entity
@Data // for the getters and setters
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column (unique = true) // Prevents items with the same name from being saved in the database
    @NotEmpty (message = "Please specify the name of the product")
    private String name;

    private String category;
    private Quantity quantity;
}
