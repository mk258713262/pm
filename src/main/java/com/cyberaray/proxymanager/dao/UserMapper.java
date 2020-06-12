package com.cyberaray.proxymanager.dao;

import com.cyberaray.proxymanager.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select(" select id, username, password, salt, email, type, status, activation_code, header_url, create_time" +
            " from user " +
            " where id = #{id} ")
    User selectById(int id);
    @Select(" select id, username, password, salt, email, type, status, activation_code, header_url, create_time" +
            " from user " +
            " where username = #{username} ")
    User selectByName(String username);
    @Select(" select id, username, password, salt, email, type, status, activation_code, header_url, create_time" +
            " from user " +
            " where email = #{email} ")
    User selectByEmail(String email);
    @Insert(" insert into user (username, password, salt, email, type, status, activation_code, header_url, create_time)" +
            " values(#{username}, #{password}, #{salt}, #{email}, #{type}, #{status}, #{activationCode}, #{headerUrl}, #{createTime})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertUser(User user);
    @Update(" update user set status = #{status} where id = #{id}")
    int updateStatus(int id, int status);
    @Update(" update user set header_url = #{headerUrl} where id = #{id}")
    int updateHeader(int id, String headerUrl);
    @Update(" update user set password = #{password} where id = #{id}")
    int updatePassword(int id, String password);
    @Select(" select id, username, password, salt, email, type, status, activation_code, header_url, create_time" +
            " from user " +
            " where 1 = 1 ")
    List<User> selectUserInfoList();

}
