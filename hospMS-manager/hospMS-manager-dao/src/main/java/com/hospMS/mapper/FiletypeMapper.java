package com.hospMS.mapper;

import com.hospMS.pojo.Filetype;
import com.hospMS.pojo.FiletypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FiletypeMapper {
    int countByExample(FiletypeExample example);

    int deleteByExample(FiletypeExample example);

    int deleteByPrimaryKey(Integer filetypeId);

    int insert(Filetype record);

    int insertSelective(Filetype record);

    List<Filetype> selectByExample(FiletypeExample example);

    Filetype selectByPrimaryKey(Integer filetypeId);

    int updateByExampleSelective(@Param("record") Filetype record, @Param("example") FiletypeExample example);

    int updateByExample(@Param("record") Filetype record, @Param("example") FiletypeExample example);

    int updateByPrimaryKeySelective(Filetype record);

    int updateByPrimaryKey(Filetype record);
}