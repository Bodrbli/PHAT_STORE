package com.example.phat_store.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
@Entity
@Table(name = "item_t")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "model")
    String model;

    @Column(name = "color")
    String color;

    @Column(name = "amount")
    Integer amount;

    @ManyToOne()
    @JoinColumn(name = "brand_id", nullable = false)
    Brand brand;

    @ManyToOne()
    @JoinColumn(name = "category_id", nullable = false)
    Category category;
}
