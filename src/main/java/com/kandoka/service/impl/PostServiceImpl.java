package com.kandoka.service.impl;

import com.kandoka.entity.Post;
import com.kandoka.mapper.PostMapper;
import com.kandoka.service.PostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kandoka
 * @since 2020-11-25
 */
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {

}
