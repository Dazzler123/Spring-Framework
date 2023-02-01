package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    ModelMapper mapper;

    @Autowired
    ItemRepo repo;

    @Override
    public void addItem(ItemDTO dto) {
        if (repo.existsById(dto.getItemCode())) {
            throw new RuntimeException("Item already exists!");
        } else {
            Item map = mapper.map(dto, Item.class);
            repo.save(map);
        }
    }

    @Override
    public void updateItem(ItemDTO dto) {
        if (!repo.existsById(dto.getItemCode())) {
            throw new RuntimeException("Item does not exists!");
        } else {
            Item map = mapper.map(dto, Item.class);
            repo.save(map);
        }
    }

    @Override
    public void deleteItem(String id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Item does not exists!");
        } else {
            repo.deleteById(id);
        }
    }

    @Override
    public ArrayList<ItemDTO> getAllItems() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<ItemDTO>>(){}.getType());
    }
}
