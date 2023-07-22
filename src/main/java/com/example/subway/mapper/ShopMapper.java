package com.example.subway.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ShopMapper {

    List<Map<String, Object>> getShopList();

    Map<String,Object> getShopView(int sho_id);
}
