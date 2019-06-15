package com.itheima.dao;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Select;

public interface ItemsDao {

    //根据id查询 用户数据
    @Select("select * from items where id = #{id}")
    public Items findById(Integer id);
}
