package com.fh.controller;

import com.fh.service.SysUserService;
import com.xdh.frame.core.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private SysUserService service;

    /**
     * 获取登录的用户信息
     */
    @RequestMapping("/user")
    public R info(){
        return R.ok("成功",service.queryObject("fh"));
    }

}
