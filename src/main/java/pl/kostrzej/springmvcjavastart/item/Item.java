package pl.kostrzej.springmvcjavastart.item;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;
    private String name;
    @Column(name = "short_description")
    private String shortDescription;
    @Column(length = 1024)
    private String description;
    @Column(name = "image_url")
    private String imageUrl;
}
