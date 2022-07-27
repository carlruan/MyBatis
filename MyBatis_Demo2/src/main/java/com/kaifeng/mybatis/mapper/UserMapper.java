package com.kaifeng.mybatis.mapper;

import com.kaifeng.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
//    int insertUser();

    void insertUser(User user);

    void updateUser();

    void deleteUser();

    User getUserById();

    List<User> getAllUser();

    User getUserByUsername(String username);

    User checkLogin(String usernmae, String password);

    User checkLoginByMap(Map<String, Object> map);

    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

    User getUserByLike(@Param("username") String username);

    int deleteMore(@Param("ids") String ids);
}
