package com.itheima.dao;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemsDao {

    @Select("select * from items")
    public List<Items> findAll();
}
