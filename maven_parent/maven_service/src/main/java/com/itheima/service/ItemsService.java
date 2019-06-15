package com.itheima.service;

import com.itheima.domain.Items;

import java.util.List;

public interface ItemsService {


    //根据id查询 用户数据
    public List<Items> findAll();
}
