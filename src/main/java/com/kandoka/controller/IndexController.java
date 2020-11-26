package com.kandoka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Kandoka
 * @createTime: 2020/11/25 16:47
 * @description:
 */
@Controller
public class IndexController {
    @RequestMapping({"", "/", "index"})
    public String index() { return "index"; }
}
