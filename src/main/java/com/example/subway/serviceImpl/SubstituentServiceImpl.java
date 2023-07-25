package com.example.subway.serviceImpl;

import com.example.subway.mapper.SubstituentMapper;
import com.example.subway.service.SubstituentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SubstituentServiceImpl implements SubstituentService {

    private final SubstituentMapper substituentMapper;

    public SubstituentServiceImpl(SubstituentMapper substituentMapper) {
        this.substituentMapper = substituentMapper;
    }

    @Override
    public List<Map<String, Object>> getSubstituentList() {
        return substituentMapper.getSubstituentList();
    }
}
