package com.example.subway.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface IngredientMapper {

    List<Map<String, Object>> getIngredientList();
}
