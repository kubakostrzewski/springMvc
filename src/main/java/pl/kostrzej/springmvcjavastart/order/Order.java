package pl.kostrzej.springmvcjavastart.order;

import lombok.Data;
import pl.kostrzej.springmvcjavastart.item.Item;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "client_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    @JoinTable(name = "order_item", joinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id"))
    private List<Item> items = new ArrayList<>();
    private String address;
    private String telephone;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
