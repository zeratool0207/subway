package com.example.subway.serviceImpl;

import com.example.subway.mapper.NewsNotiMapper;
import com.example.subway.service.NewsNotiService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NewsNotiServiceImpl implements NewsNotiService {

    private final NewsNotiMapper newsNotiMapper;

    public NewsNotiServiceImpl(NewsNotiMapper newsNotiMapper) {
        this.newsNotiMapper = newsNotiMapper;
    }


    @Override
    public List<Map<String, Object>> getList() {
        return newsNotiMapper.getList();
    }

    @Override
    public Map<String, Object> getView(int nno_id) {
        return newsNotiMapper.getView(nno_id);
    }


}
