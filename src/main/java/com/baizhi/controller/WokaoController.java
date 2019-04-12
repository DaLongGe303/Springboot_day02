package com.baizhi.controller;

import com.baizhi.dao.WokaoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WokaoController {
    @Autowired
    private WokaoDao wokaoDao;


}
