package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @PostMapping
    public String saveItem(ItemDTO dto) {
        System.out.println(dto.toString());
        return "Item Saved Successfully.";
    }

    @GetMapping
    public ResponseUtil getItems() {
        ArrayList<ItemDTO> items = new ArrayList<>();
        items.add(new ItemDTO("ITM-001", "Maliban Biscuit Assortment 700G", "50 Packs", 1950));
        items.add(new ItemDTO("ITM-002", "Maliban Biscuit Assortment 700G", "50 Packs", 1950));
        items.add(new ItemDTO("ITM-003", "Maliban Biscuit Assortment 700G", "50 Packs", 1950));
        items.add(new ItemDTO("ITM-004", "Maliban Biscuit Assortment 700G", "50 Packs", 1950));
        items.add(new ItemDTO("ITM-005", "Maliban Biscuit Assortment 700G", "50 Packs", 1950));
        return new ResponseUtil("200", "All Items Loaded", items);
    }

    @PutMapping
    public String updateItem(@RequestBody ItemDTO dto) {
        System.out.println(dto.toString());
        return "Item Updated Successfully.";
    }

    @DeleteMapping(params = "id")
    public String deleteItem(String id) {
        System.out.println(id);
        return "Item Delete Successfully.";
    }
}
