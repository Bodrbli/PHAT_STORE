package com.example.phat_store.model.dao.catrgory;

import com.example.phat_store.model.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface IRepoCategory extends CrudRepository<Category, Integer> {
    Category findById(int id);
}
