package com.example.subway.service;

import java.util.List;
import java.util.Map;

public interface EventService {
    List<Map<String,Object>> getList();

    Map<String,Object> getView(int eve_id);

}
