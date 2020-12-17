package com.kandoka.vo;

import com.kandoka.entity.Post;
import lombok.Data;

/**
 * @Description TODO
 * @Author handong3
 * @Date 2020/12/17 17:20
 */
@Data
public class PostVo extends Post {

    private Long authorId;
    private String authorName;
    private String authorAvatar;

    private String categoryName;

}
