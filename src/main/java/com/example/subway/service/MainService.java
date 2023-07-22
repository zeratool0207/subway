package com.example.subway.service;

import java.util.List;
import java.util.Map;

public interface MainService {

    List<Map<String,Object>> getMenuList();

    List<Map<String,Object>> getProductList();

    List<Map<String,Object>> getNewsList();

}
