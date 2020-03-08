package com.zhangfan.community.mapper;


import com.zhangfan.community.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserMapper {
    int addUser(User user);
    List<User> queryAllUser();

}
