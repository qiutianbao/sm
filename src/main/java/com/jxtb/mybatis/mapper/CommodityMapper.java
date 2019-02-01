package com.jxtb.mybatis.mapper;


import com.jxtb.mybatis.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
* 商品DAO
* */
@Mapper
public interface CommodityMapper {
    //获取全部商品
    List<Commodity> findAll();

    //新增商品
    void insertCommodity(Commodity commodity);

    //修改商品
    void updateCommodity(Commodity commodity);

    //根据id获取商品
    Commodity findById(Integer id);

    //根据id删除商品
    void deleteById(Integer id);
}
