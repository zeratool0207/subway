package com.example.subway.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface EventMapper {

    List<Map<String, Object>> getList();

    Map<String,Object> getView(int eve_id);

}
