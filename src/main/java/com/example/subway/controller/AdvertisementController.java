package com.example.subway.controller;

import com.example.subway.service.AdvertisementService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AdvertisementController {

    private final AdvertisementService advertisementService;

    public AdvertisementController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @GetMapping("/api/adv/list")
    public List<Map<String,Object>> getAdvertisementList() {
        List<Map<String, Object>> list = new ArrayList<>();

        list = advertisementService.getAdvertisementList();
        System.out.println("this is list ::" + list);

        return list;
    }
}
