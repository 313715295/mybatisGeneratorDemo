package com.zwq.dao;

import com.zwq.pojo.Tea;
import java.util.List;

public interface TeaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tea record);

    Tea selectByPrimaryKey(Integer id);

    List<Tea> selectAll();

    int updateByPrimaryKey(Tea record);
}