package com.jxtb.swagger;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jxtb on 2019/1/31.
 */
@RestController
@RequestMapping(value="/commoditys")
@Api(value="商品信息接口",tags={"商品信息接口"})
public class Swagger2Swagger {
    @Autowired
    //CommodityRepostory commodityRepostory;

    @ApiOperation(value="获取商品详细信息", notes="根据商品的id来获取商品详细信息")
    @ApiImplicitParam(name = "id", value = "商品ID", required = true,paramType = "query", dataType = "Integer")
    @GetMapping(value="/findById")
    //public Commodity findById(@RequestParam(value = "id")int id){
    public String findById(){
        //Commodity commodity = commodityRepostory.findById(id);
        //return commodity;
        return "";
    }

    @ApiOperation(value="获取商品列表", notes="获取商品列表")
    @GetMapping(value="/getcommodityList")
    public String getCommodityList(){
        //return commodityRepostory.findAll();
        return "";
    }


    @ApiOperation(value="保存商品", notes="保存商品")
    @PostMapping(value="/saveCommodity")
    //public String saveCommodity(@RequestBody @ApiParam(name="商品对象",value="传入json格式",required=true) Commodity commodity){
    public String saveCommodity(@RequestBody @ApiParam(name="商品对象",value="传入json格式",required=true) String commodity){
        //commodityRepostory.save(commodity);
        return "success!";
    }

    @ApiOperation(value="修改商品", notes="修改商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="主键id",required=true,paramType="query",dataType="Integer"),
            @ApiImplicitParam(name="name",value="商品名称",required=true,paramType="query",dataType = "String"),
            @ApiImplicitParam(name="standard",value="商品规格",required=true,paramType="query",dataType = "String"),
            @ApiImplicitParam(name="temperature",value="商品温度",required=true,paramType="query",dataType = "String"),
            @ApiImplicitParam(name="price",value="商品价格",required=true,paramType="query",dataType = "Integer"),
            @ApiImplicitParam(name="description",value="商品描述",required=true,paramType="query",dataType = "String")
    })
    @PutMapping(value="/updateCommodity")
    public String updateCommodity(@RequestParam(value = "id")int id,@RequestParam(value = "name")String name,
                             @RequestParam(value = "standard")String standard,
                             @RequestParam(value = "temperature")String temperature,
                             @RequestParam(value = "price")int price,
                             @RequestParam(value = "description")String description){
       // Commodity commodity=new  Commodity(id,name,standard,temperature,price,description);
       // commodityRepostory.save(commodity);
        return "success!";
    }


    @ApiOperation(value="删除商品", notes="根据商品的id来删除商品")
    @ApiImplicitParam(name = "id", value = "商品ID", required = true,paramType = "query", dataType = "Integer")
    @DeleteMapping(value="/deleteCommodityById")
    public String deleteCommodityById(@RequestParam(value = "id")int id){
        //Commodity commodity = commodityRepostory.findById(id);
      //  commodityRepostory.delete(commodity);
        return "success!";
    }
}
