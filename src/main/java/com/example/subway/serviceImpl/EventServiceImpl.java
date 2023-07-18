package com.example.subway.serviceImpl;

import com.example.subway.mapper.EventMapper;
import com.example.subway.service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EventServiceImpl implements EventService {
    private final EventMapper eventMapper;

    public EventServiceImpl(EventMapper eventMapper) {
        this.eventMapper = eventMapper;
    }


    @Override
    public List<Map<String, Object>> getList() {
        return eventMapper.getList();
    }

    @Override
    public Map<String, Object> getView(int eve_id) {
        return eventMapper.getView(eve_id);
    }
}
