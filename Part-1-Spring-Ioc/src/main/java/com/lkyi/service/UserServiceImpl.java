package com.lkyi.service;

import com.lkyi.dao.UserDao;
import com.lkyi.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
          userDao.getUser();
    }
}
