package pl.kostrzej.springmvcjavastart.item;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@AllArgsConstructor
public class ItemController {

    ItemRepository itemRepository;

    @GetMapping("/danie/{name}")
    public String getDish(@PathVariable String name, Model model) {
        Item item = itemRepository.findByNameIgnoreCase(name.replace('-',' '));
        model.addAttribute(item);
        return "item";
    }
}
