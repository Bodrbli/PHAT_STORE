package com.example.phat_store.model.dao.brand;

import com.example.phat_store.model.entities.Brand;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRepoBrand extends CrudRepository<Brand, Integer> {
    Brand findById(int id);

}
