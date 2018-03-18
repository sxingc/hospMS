package com.hospMS.mapper;

import com.hospMS.pojo.RoleAuthority;
import com.hospMS.pojo.RoleAuthorityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleAuthorityMapper {
    int countByExample(RoleAuthorityExample example);

    int deleteByExample(RoleAuthorityExample example);

    int deleteByPrimaryKey(Integer roleAuthorityId);

    int insert(RoleAuthority record);

    int insertSelective(RoleAuthority record);

    List<RoleAuthority> selectByExample(RoleAuthorityExample example);

    RoleAuthority selectByPrimaryKey(Integer roleAuthorityId);

    int updateByExampleSelective(@Param("record") RoleAuthority record, @Param("example") RoleAuthorityExample example);

    int updateByExample(@Param("record") RoleAuthority record, @Param("example") RoleAuthorityExample example);

    int updateByPrimaryKeySelective(RoleAuthority record);

    int updateByPrimaryKey(RoleAuthority record);
}