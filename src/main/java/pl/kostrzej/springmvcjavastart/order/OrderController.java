package pl.kostrzej.springmvcjavastart.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@AllArgsConstructor
public class OrderController {

    private OrderRepository orderRepository;

    @GetMapping("/order")
    public String order() {
        return "order";
    }
}
