package com.kandoka.controller;

import com.kandoka.service.PostService;
import com.kandoka.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description TODO
 * @Author handong3
 * @Date 2020/12/15 11:08
 */
public class BaseController {
    @Autowired
    HttpServletRequest req;

    @Autowired
    PostService postService;

    @Autowired
    RedisUtil redisUtil;
}


