package com.example.subway.controller;

import com.example.subway.service.NewsNotiService;
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
public class NewsNotiController {

    private final NewsNotiService newsNotiService;

    public NewsNotiController(NewsNotiService newsNotiService) {
        this.newsNotiService = newsNotiService;
    }

    @GetMapping("/api/news/list")
    public List<Map<String,Object>> getList() {
        List<Map<String, Object>> list = new ArrayList<>();

        list = newsNotiService.getList();
        System.out.println("this is list ::" + list);

        return list;
    }

    @GetMapping("/api/news/view")
    public Map<String,Object> getView(@RequestParam int nno_id) {
        Map<String, Object> newsMap = new HashMap<>();

        newsMap = newsNotiService.getView(nno_id);
        System.out.println("this is map::" + newsMap);

        return newsMap;
    }






}
