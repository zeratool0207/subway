package com.example.subway.service;

import java.util.List;
import java.util.Map;

public interface ShopService {

    List<Map<String, Object>> getShopList();

    Map<String, Object> getShoipView(int sho_id);
}
