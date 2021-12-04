package com.soft.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft.entity.Userinfo;
import com.soft.mapper.LoginMapper;
import com.soft.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl extends ServiceImpl<LoginMapper, Userinfo> implements LoginService {

}
