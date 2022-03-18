package com.shailendra.item.repository;

import com.shailendra.item.entity.item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface itemRepository extends CrudRepository<item,Integer> {
}
