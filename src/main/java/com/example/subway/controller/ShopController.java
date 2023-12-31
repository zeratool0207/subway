package com.example.subway.controller;

import com.example.subway.service.ShopService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ShopController {

    private final ShopService shopService;


    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/api/shop/list")
    public List<Map<String,Object>> getShopList() {
        List<Map<String, Object>> list = new ArrayList<>();

        list = shopService.getShopList();
        System.out.println("this is list ::" + list);

        return list;
    }

    @GetMapping("/api/shop/view")
    public Map<String,Object> getShopView(@RequestParam int sho_id) {
        Map<String, Object> shopMap = new HashMap<>();

        shopMap = shopService.getShoipView(sho_id);
        System.out.println("this is map:" + shopMap);

        return shopMap;

    }



}
