package com.example.subway.serviceImpl;

import com.example.subway.mapper.MainMapper;
import com.example.subway.service.MainService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MainServiceImpl implements MainService {

    private final MainMapper mainMapper;

    public MainServiceImpl(MainMapper mainMapper) {
        this.mainMapper = mainMapper;
    }


    @Override
    public List<Map<String, Object>> getMenuList() {
        return mainMapper.getMenuList();
    }

    @Override
    public List<Map<String, Object>> getProductList() {
        return mainMapper.getProductList();
    }

    @Override
    public List<Map<String, Object>> getNewsList() {
        return mainMapper.getNewsList();
    }
}
