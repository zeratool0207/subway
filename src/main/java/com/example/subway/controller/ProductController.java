package com.example.subway.controller;

import com.example.subway.service.ProductService;
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
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/prd/list")
    public List<Map<String,Object>> getProductList() {
        List<Map<String, Object>> list = new ArrayList<>();

        list = productService.getProductList();
        System.out.println("this is ProductList ::" + list);

        return list;
    }

    @GetMapping("/api/prd/cateList")
    public List<Map<String,Object>> getProductCateList(@RequestParam String pro_cate_id) {
        List<Map<String, Object>> list = new ArrayList<>();

        list = productService.getProductCateList(pro_cate_id);
        System.out.println("this is ProductList ::" + list);

        return list;
    }

    @GetMapping("/api/prd/detail")
    public Map<String,Object> getProductDetail(@RequestParam int pro_id) {
        Map<String, Object> productMap = new HashMap<>();
        List<Map<String, Object>> composeList = new ArrayList<>();

        productMap = productService.getProductDetail(pro_id);
        composeList = productService.getComposeDetail(pro_id);
        productMap.put("composeList", composeList);
        System.out.println("this is productMap ::" + productMap);

        return productMap;
    }


}


