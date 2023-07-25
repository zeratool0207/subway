package com.example.subway.controller;

import com.example.subway.service.SubstituentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SubstituentController {

    private final SubstituentService substituentService;

    public SubstituentController(SubstituentService substituentService) {
        this.substituentService = substituentService;
    }

    @GetMapping("/api/substituent/list")
    public List<Map<String,Object>> getSubstituentList() {
        List<Map<String, Object>> list = new ArrayList<>();

        list = substituentService.getSubstituentList();
        System.out.println("this is list ::" + list);

        return list;
    }
}
