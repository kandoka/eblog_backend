package com.kandoka.service.impl;

import com.kandoka.entity.UserMessage;
import com.kandoka.mapper.UserMessageMapper;
import com.kandoka.service.UserMessageService;
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
public class UserMessageServiceImpl extends ServiceImpl<UserMessageMapper, UserMessage> implements UserMessageService {

}
