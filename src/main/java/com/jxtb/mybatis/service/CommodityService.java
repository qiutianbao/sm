package com.jxtb.mybatis.service;

import com.jxtb.mybatis.entity.Commodity;
import com.jxtb.mybatis.mapper.CommodityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* 商品Service实现类
* */
@Service
public class CommodityService {
    @Autowired
    private CommodityMapper commodityDao;

    //获取全部商品
    public List<Commodity> findAll(){
        return commodityDao.findAll();
    }

    //新增商品
    public void insertCommodity(Commodity commodity){
        commodityDao.insertCommodity(commodity);
    }

    //修改商品
    public void updateCommodity(Commodity commodity){
        commodityDao.updateCommodity(commodity);
    }

    //根据id获取商品
    public Commodity findById(Integer id){
        return commodityDao.findById(id);
    }

    //根据id删除商品
    public void deleteById(Integer id){
        commodityDao.deleteById(id);
    }
}
