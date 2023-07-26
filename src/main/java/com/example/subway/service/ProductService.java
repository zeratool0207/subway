package com.example.subway.service;

import java.util.List;
import java.util.Map;

public interface ProductService {

    List<Map<String,Object>> getProductList();

    List<Map<String,Object>> getProductCateList(String pro_cate_id);

    Map<String,Object> getProductDetail(int pro_id);

    List<Map<String, Object>> getComposeDetail(int pro_id);

}
