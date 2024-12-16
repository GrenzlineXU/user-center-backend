package com.zhiyu.usercenter.service;

import com.zhiyu.usercenter.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author yu
* @description 针对表【user】的数据库操作Service
* @createDate 2024-12-08 06:39:28
*/
public interface UserService extends IService<User> {


    /**
     *
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @param gunCode
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String gunCode);

    /**
     * 用户登录
     *
     * @param userAccount
     * @param userPassword
     * @param request
     * @return
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
