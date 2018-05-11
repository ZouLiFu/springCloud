package com.lywx.userservice.dao;


import com.lywx.userservice.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author zoulifu
 * @version V1.0
 * @Description:
 * @date: 2018/5/4 11:03
 */
@Mapper
public interface UserDao {
    @Select("SELECT t.user_id userId,t.username,t.`password`,t.mobile,t.email,t.`status`,t.create_time createTime FROM sys_user  t WHERE t.user_id = #{userId}")
    public User getUserList(long userId);
}
