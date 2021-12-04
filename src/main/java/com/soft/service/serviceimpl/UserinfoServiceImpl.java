package com.soft.service.serviceimpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft.entity.Userinfo;
import com.soft.mapper.UserinfoMapper;
import com.soft.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements UserinfoService {

    @Autowired
    private UserinfoMapper userinfoMapper;



    /**
     * 分页查询用户数据
     *
     * @param pageNum  第几页
     * @param pageSize 每页多少条数据
     * @param param    查询参数-名称
     * @return
     */
    @Override
    public IPage<Userinfo> selectUserinfoPage(int pageNum, int pageSize, String param)
    {
        QueryWrapper<Userinfo> queryWrapper = new QueryWrapper<>();
        if(param.isEmpty()){
//            queryWrapper.isNotNull("Username");
            queryWrapper.like("Username",param);
        }
        Page<Userinfo> page = new Page<>(pageNum,pageSize);
        return userinfoMapper.selectPage(page,queryWrapper);
    }

    @Override
    public int addUserinfo(Userinfo userinfo) {
        return userinfoMapper.insert(userinfo);
    }
}
