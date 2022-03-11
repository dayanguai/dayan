package com.dayan.service;

import com.dayan.dao.UserDao;

/**
 * @author ：dayan
 * @date ：Created in 2022-03-06 15:54
 * @description：
 */
public class UserService {
    public static void testService() {
        System.out.println("UserService Test...");
        // 调用UserDao的方法
        UserDao.testDao();
    }
}
