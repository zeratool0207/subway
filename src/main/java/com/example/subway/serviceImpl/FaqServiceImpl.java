package com.example.subway.serviceImpl;

import com.example.subway.mapper.FaqMapper;
import com.example.subway.service.FaqService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FaqServiceImpl implements FaqService {

    private final FaqMapper faqMapper;

    public FaqServiceImpl(FaqMapper faqMapper) {
        this.faqMapper = faqMapper;
    }

    @Override
    public List<Map<String, Object>> getFaqList() {
        return faqMapper.getFaqList();
    }
}
