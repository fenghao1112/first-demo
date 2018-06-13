package com.fh.service.impl;

import com.fh.dao.SysUserDao;
import com.fh.entity.SysUser;
import com.fh.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao dao;

    @Override
    public SysUser queryObject(String userName) {
        return dao.queryObject(userName);
    }
}
