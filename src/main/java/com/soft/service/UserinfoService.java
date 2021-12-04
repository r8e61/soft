package com.soft.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft.entity.Userinfo;

public interface UserinfoService extends IService<Userinfo> {



    /**
     * 分页查询用户数据
     * @param pageNum 第几页
     * @param pageSize 每页多少条数据
     * @param param 查询参数-名称
     * @return
     */
    public IPage<Userinfo> selectUserinfoPage(int pageNum, int pageSize, String param);


    public int addUserinfo(Userinfo userinfo);
}
