package com.kandoka.service.impl;

import com.kandoka.entity.Category;
import com.kandoka.mapper.CategoryMapper;
import com.kandoka.service.CategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
