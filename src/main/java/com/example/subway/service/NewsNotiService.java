package com.example.subway.service;

import java.util.List;
import java.util.Map;

public interface NewsNotiService {

    List<Map<String, Object>> getList();

    Map<String, Object> getView(int nno_id);
}
