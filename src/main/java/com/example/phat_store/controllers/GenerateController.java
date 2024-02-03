package com.example.phat_store.controllers;

import com.example.phat_store.model.dao.brand.IDaoBrand;
import com.example.phat_store.model.entities.Brand;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/service")
public class GenerateController {
    private final IDaoBrand daoBrand;

    @GetMapping("/generate")
    public void generate() {
        generateBrands();
    }

    private void generateBrands() {
        daoBrand.save(new Brand("Kangol"));
        daoBrand.save(new Brand("ProClub"));
        daoBrand.save(new Brand("Novesta"));
        daoBrand.save(new Brand("PHAT"));
    }
}
