package com.lkyi.mapper;

import com.lkyi.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

    int addUser(User user);

    int deleteUser(@Param("id") int id);
}
