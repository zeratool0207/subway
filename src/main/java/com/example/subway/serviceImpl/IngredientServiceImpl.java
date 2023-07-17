package com.example.subway.serviceImpl;

import com.example.subway.mapper.IngredientMapper;
import com.example.subway.service.IngredientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientMapper ingredientMapper;

    public IngredientServiceImpl(IngredientMapper ingredientMapper) {
        this.ingredientMapper = ingredientMapper;
    }


    @Override
    public List<Map<String, Object>> getIngredientList() {
        return ingredientMapper.getIngredientList();
    }
}
