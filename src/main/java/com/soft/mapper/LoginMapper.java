package com.soft.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper extends BaseMapper<Userinfo> {

}
