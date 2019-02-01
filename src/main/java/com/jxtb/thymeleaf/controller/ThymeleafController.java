package com.jxtb.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jxtb on 2019/2/1.
 */
@Controller
public class ThymeleafController {
    @RequestMapping("/helloThy")
    public String testThymeleaf(ModelMap modelMap){
        modelMap.addAttribute("msg", "Hello jxtb , this is thymeleaf");
        return "thymeleaf/helloThymeleaf";
    }
}
