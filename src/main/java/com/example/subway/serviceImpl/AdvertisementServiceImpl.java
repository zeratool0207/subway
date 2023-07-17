package com.example.subway.serviceImpl;

import com.example.subway.mapper.AdvertisementMapper;
import com.example.subway.service.AdvertisementService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {

    private final AdvertisementMapper advertisementMapper;

    public AdvertisementServiceImpl(AdvertisementMapper advertisementMapper) {
        this.advertisementMapper = advertisementMapper;
    }

    @Override
    public List<Map<String, Object>> getAdvertisementList() {
        return advertisementMapper.getAdvertisementList();
    }
}
