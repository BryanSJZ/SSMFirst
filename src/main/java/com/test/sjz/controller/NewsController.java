package com.test.sjz.controller;

import com.test.sjz.entity.NewsWithBLOBs;
import com.test.sjz.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 单继重
 * @since 2017/9/1 13:43
 */

@Controller
@RequestMapping(value = "/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public String queryById(@RequestParam("id") int id, Model model){
        NewsWithBLOBs newsWithBLOBs = newsService.queryById(id);
        model.addAttribute("news",newsWithBLOBs);
        return "index";
    }
}
