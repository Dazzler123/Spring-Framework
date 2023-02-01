package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.controller.service.ItemService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @Autowired
    ItemService service;

    @PostMapping
    public ResponseUtil saveItem(ItemDTO dto) {
        service.addItem(dto);

        System.out.println(dto.toString());
        return new ResponseUtil("200", "Item saved.", null);
    }

    @GetMapping
    public ResponseUtil getItems() {
        ArrayList<ItemDTO> allItems = service.getAllItems();
        return new ResponseUtil("200", "All Items Loaded", allItems);
    }

    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO dto) {
        service.updateItem(dto);

        System.out.println(dto.toString());
        return new ResponseUtil("200", "Item updated.", null);
    }

    @DeleteMapping(params = "itemCode")
    public ResponseUtil deleteItem(String itemCode) {
        service.deleteItem(itemCode);

        System.out.println(itemCode);
        return new ResponseUtil("200", "Item deleted.", null);
    }
}
