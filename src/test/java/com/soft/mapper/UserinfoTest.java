package com.soft.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.soft.entity.Userinfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserinfoTest {


    @Autowired
    public UserinfoMapper userinfoMapper;
    @Test
    void testSelectUser(){

        System.out.println(userinfoMapper.selectById(1));
        QueryWrapper<Userinfo> queryWrapper = new QueryWrapper<Userinfo>();
        queryWrapper.eq("id",2);
//        queryWrapper.likeLeft("Sex","12");//%str
        System.out.println("user = "+userinfoMapper.selectOne(queryWrapper));;
    }
}
