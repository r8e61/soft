package com.soft.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.soft.common.ResultMapUtil;
import com.soft.entity.Userinfo;
import com.soft.mapper.UserinfoMapper;
import com.soft.service.serviceimpl.UserinfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class AdminController {


    @Autowired
    private UserinfoServiceImpl userinfoService;

    private UserinfoMapper userinfoMapper;

    /**跳转到登录页面*/
    @RequestMapping(value = "/userlogin")
    public String tologin(){
        userinfoService.getById(1);
        System.out.println(userinfoService.getById(1));
        return "/userlogin";
    }



    /**
     * 分页查询用户列表
     */
    @RequestMapping(value = "/userinfoQueryPage")
    @ResponseBody
    public Object userinfoQueryPage(@RequestParam(defaultValue = "")String param, @RequestParam(defaultValue = "1")int pageNum, @RequestParam(defaultValue = "10")int pageSize){
        try{
            IPage<Userinfo> iPage = userinfoService.selectUserinfoPage(pageNum,pageSize,param);
            System.out.println("iPage:"+userinfoService.selectUserinfoPage(pageNum,pageSize,param));
            return ResultMapUtil.getHashMapMysqlPage(iPage);
        } catch (Exception e){
            System.out.println("e = "+e);
            return ResultMapUtil.getHashMapException(e);
        }
    }


    /**
     * 菜单点击跳转到会员信息管理页面
     * @return
     */
    @RequestMapping(value = "/touser")
    public String druginfo(){
        return "/druginfo";
    }

    /**
     * 跳转到修改页面
     */
    @RequestMapping(value = "/userinfoPage")
    public String userinfoPage(){
        return"/druginfoPage";
    }

    /**
     * 添加一个用户
     */
    @RequestMapping(value = "/userinfoAdd")
    @ResponseBody
    public Object druginfoAdd(Userinfo userinfo){
        try{
            int i = userinfoService.addUserinfo(userinfo);
            return ResultMapUtil.getHashMapSave(i);
        } catch (Exception e){
            return ResultMapUtil.getHashMapException(e);
        }
    }

    /**
     * 转向用户编辑页面
     */
    @RequestMapping(value = "/userinfoQueryById")
    public String userinfoQueryById(@RequestParam(name = "id",required = true)Integer id, Model model){
        Userinfo userinfo = userinfoService.getById(id);
        model.addAttribute("obj",userinfo);
        return "/druginfoPage";
    }

    /**
     * 修改一个药品
     */
    @RequestMapping(value = "/userinfoEdit")
    @ResponseBody
    public Object druginfoEdit(Userinfo userinfo){
        try{
            int i = userinfoMapper.updateById(userinfo);
            return ResultMapUtil.getHashMapSave(i);
        } catch (Exception e){
            return ResultMapUtil.getHashMapException(e);
        }
    }

    /**
     * 删除一个药品
     */
    @RequestMapping(value = "/userinfoDelById")
    @ResponseBody
    public Object druginfoDelById(Integer id){
        try{
            int i = userinfoMapper.deleteById(id);
            return ResultMapUtil.getHashMapDel(i);
        } catch (Exception e){
            return ResultMapUtil.getHashMapException(e);
        }
    }

    /**
     * 获取所有药品
     */
    @RequestMapping(value = "/userinfoList")
    @ResponseBody
    public Object userinfoList(){
        List<Userinfo> userinfoList = userinfoMapper.selectList(null);
        return ResultMapUtil.getHashMapList(userinfoList);
    }

    /**
     * 转向药品保质期检查页面
     */
    @RequestMapping(value = "/warranty")
    public String warranty(){
        return "/warranty";
    }



}
