package com.jxtb.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jxtb on 2019/2/1.
 */
@Controller
public class FreemarkerController {
    @RequestMapping("/helloFtl")
    public String testFreemarker(ModelMap modelMap){
        modelMap.addAttribute("msg", "Hello jxtb , this is freemarker");
        return "freemarker/helloFtl";
    }
}
