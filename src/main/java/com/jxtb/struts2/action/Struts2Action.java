package com.jxtb.struts2.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import org.apache.commons.collections.map.HashedMap;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by jxtb on 2019/2/1.
 */
@Namespace("/")
public class Struts2Action  extends ActionSupport {

    /**
     * /WEB-INF/content/helloJsp.jsp
     * @return
     * @throws IOException
     */
    //http://localhost:8080/helloStruts2.action
    @Action(value="/helloStruts2",results = {@Result(name="success",location="helloStruts2.jsp")})
    public String helloStruts2() throws IOException {
        ActionContext context= ActionContext.getContext();
        context.put("hello", "jxtb");
        return SUCCESS;
    }

    //http://localhost:8080/query.action
    @Action(value="/query")
    public String query() throws IOException {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/json");
        response.setCharacterEncoding("UTF-8");
        //获取 输出流
        OutputStream os=ServletActionContext.getResponse().getOutputStream();
        //获取查询出来经过处理的分页结果
        Map<String,Object> map=new HashedMap();
        map.put("jxtb","吉祥天宝");
        //List<Commodity> list=commodityService.findAll();
        //PageInfo<Commodity> pageInfo=new PageInfo<Commodity>(list);
        //将分页结果转换为json数组并且转换为字符串
        String json= JSONArray.fromObject(map).toString();
        //将结果返回给页面
        os.write(json.getBytes("UTF-8"));
        return NONE;
    }
}
