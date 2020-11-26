package com.kandoka.service.impl;

import com.kandoka.entity.Comment;
import com.kandoka.mapper.CommentMapper;
import com.kandoka.service.CommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
