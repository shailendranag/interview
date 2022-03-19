package com.shailendra.item.service;

import com.shailendra.item.entity.item;
import com.shailendra.item.repository.itemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class itemService {

    private itemRepository itemrepository;

    @Autowired
    public itemService(itemRepository itemrepository) {
        this.itemrepository = itemrepository;
    }

    public item getItem(int itemid){
        return itemrepository.findById(itemid).orElseThrow();
    }

    public List getAllItems(){
        List itemsList = new ArrayList();
        itemrepository.findAll().forEach((item)->itemsList.add(item));
        return itemsList;
    }
}
