package com.example.subway.controller;

import com.example.subway.service.MainService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MainController {

    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/api/main/list")
    public List<Map<String, List<Map<String, Object>>>> getMenuList() {
        List<Map<String, List<Map<String, Object>>>> list = new ArrayList<>();

        List<Map<String, Object>> menuList = new ArrayList<>();
        List<Map<String, Object>> productList = new ArrayList<>();
        List<Map<String, Object>> newsList = new ArrayList<>();

        menuList = mainService.getMenuList();
        productList = mainService.getProductList();
//        newsList = mainService.getNewsList();

        Map<String, List<Map<String, Object>>> listWithName = new HashMap<>();
        listWithName.put("menuList",menuList);
        listWithName.put("productList",productList);
//        listWithName.put("newsList",newsList);

        list.add(listWithName);

        return list;
    }

}
