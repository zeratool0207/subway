package com.example.subway.controller;

import com.example.subway.service.FaqService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FaqController {

    private final FaqService faqService;

    public FaqController(FaqService faqService) {
        this.faqService = faqService;
    }

    @GetMapping("/api/faq/list")
    public List<Map<String,Object>> getFaqList() {
        List<Map<String, Object>> list = new ArrayList<>();

        list = faqService.getFaqList();
        System.out.println("this is list ::" + list);

        return list;
    }


}
