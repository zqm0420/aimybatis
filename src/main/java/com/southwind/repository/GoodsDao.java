package com.southwind.repository;

import com.southwind.entity.Goods;

import java.util.List;

public interface GoodsDao {
    List<Goods> findByID(Integer id);
}
