package com.kandoka.service.impl;

import com.kandoka.entity.User;
import com.kandoka.mapper.UserMapper;
import com.kandoka.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
