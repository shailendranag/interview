package com.shailendra.item.controller;


import com.shailendra.item.entity.item;
import com.shailendra.item.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class itemController {

    private itemService itemService;

    @Autowired
    public itemController(itemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/{itemId}")
    public item getItems(@PathVariable int itemId){
        return itemService.getItem(itemId);
    }

    @GetMapping("/allItems")
    public List getAll(){
        return itemService.getAllItems();
    }
}
