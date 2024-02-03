package com.example.phat_store.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Getter
@NoArgsConstructor
@Entity
@Table(name = "category_t")

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "name")
    String name;

    @OneToMany(mappedBy = "category")
    Set<Item> items;
}
