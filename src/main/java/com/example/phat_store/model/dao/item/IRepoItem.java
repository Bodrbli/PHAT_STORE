package com.example.phat_store.model.dao.item;

import com.example.phat_store.model.entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface IRepoItem extends CrudRepository<Item, Integer> {
    Item findById(int id);
}
