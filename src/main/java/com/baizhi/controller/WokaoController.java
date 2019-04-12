package com.baizhi.controller;

import com.baizhi.dao.WokaoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WokaoController {
    @Autowired
    private WokaoDao wokaoDao;

    @RequestMapping("selectall")
    public String select(){
        System.out.println("==========");
        System.out.println("我自己修改的");

        return null;
    }

}
