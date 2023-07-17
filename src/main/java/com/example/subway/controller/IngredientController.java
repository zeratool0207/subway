package com.example.subway.controller;

import com.example.subway.service.IngredientService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/api/ingredient/list")
    public List<Map<String,Object>> getIngredientList() {
        List<Map<String, Object>> list = new ArrayList<>();

        list = ingredientService.getIngredientList();
        System.out.println("this is list ::" + list);

        return list;
    }

}
