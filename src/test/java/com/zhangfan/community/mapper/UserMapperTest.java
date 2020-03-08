package com.zhangfan.community.mapper;

import com.zhangfan.community.pojo.User;
import com.zhangfan.community.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test() {
        //第一步：获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //方式一：getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.queryAllUser();

        for (User user : userList) {
            System.out.println(user);
        }


        //关闭sqlSession
        sqlSession.close();
    }
}
