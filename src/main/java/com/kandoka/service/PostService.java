package com.kandoka.service;

import com.kandoka.entity.Post;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author kandoka
 * @since 2020-11-25
 */
public interface PostService extends IService<Post> {
    public void initWeekRank();
}
