package com.hospMS.mapper;

import com.hospMS.pojo.User;
import com.hospMS.pojo.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //添加查找的方法
    List<User> getUserList();

    //添加批量删除的方法
    int deleteUsers(List<String> list);
    //添加按用户名查找的方法
    User selectByUsername(String username);
}