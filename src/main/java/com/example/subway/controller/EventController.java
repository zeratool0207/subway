package com.example.subway.controller;

import com.example.subway.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/api/event/list")
    public List<Map<String,Object>> getList() {
        List<Map<String, Object>> list = new ArrayList<>();

        list = eventService.getList();
        System.out.println("this is list ::" + list);

        return list;
    }

    @GetMapping("/api/event/view")
    public Map<String,Object> getView(@RequestParam int eve_id) {
        Map<String, Object> eventMap = new HashMap<>();

        eventMap = eventService.getView(eve_id);
        System.out.println("this is map::" + eventMap);

        return eventMap;
    }
}
