package com.kandoka.controller;


import com.kandoka.common.lang.Result;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author kandoka
 * @since 2020-11-25
 */
@RestController
@RequestMapping("/post")
public class PostController extends BaseController {
    @ResponseBody
    @GetMapping("/hots")
    public Result hotPost() {
        Set<ZSetOperations.TypedTuple> lastWeekRank = redisUtil.getZSetRank("last_week_rank", 0, 6);
//        System.out.println("hotPost:"+lastWeekRank);
        List<Map<String, Object>> hotPosts = new ArrayList<>();
        for (ZSetOperations.TypedTuple typedTuple : lastWeekRank) {
            Map<String, Object> map = new HashMap<>();
            map.put("comment_count", typedTuple.getScore());
            map.put("id", redisUtil.hget("rank_post_" + typedTuple.getValue(), "post:id"));
            map.put("title", redisUtil.hget("rank_post_" + typedTuple.getValue(), "post:title"));
            hotPosts.add(map);
        }
        return Result.succ(hotPosts);
    }
}