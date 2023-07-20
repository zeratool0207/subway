package com.example.subway.serviceImpl;

import com.example.subway.service.ShopService;
import org.springframework.stereotype.Service;
import com.example.subway.mapper.ShopMapper;

import java.util.List;
import java.util.Map;

@Service
public class ShopServiceImpl implements ShopService {

    private final ShopMapper shopMapper;

    public ShopServiceImpl(ShopMapper shopMapper) {
        this.shopMapper = shopMapper;
    }

    @Override
    public List<Map<String, Object>> getShopList() {
        return shopMapper.getShopList();
    }
}
