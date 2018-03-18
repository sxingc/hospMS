package com.hospMS.mapper;

import com.hospMS.pojo.Pathology;
import com.hospMS.pojo.PathologyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PathologyMapper {
    int countByExample(PathologyExample example);

    int deleteByExample(PathologyExample example);

    int deleteByPrimaryKey(Integer pathologyId);

    int insert(Pathology record);

    int insertSelective(Pathology record);

    List<Pathology> selectByExample(PathologyExample example);

    Pathology selectByPrimaryKey(Integer pathologyId);

    int updateByExampleSelective(@Param("record") Pathology record, @Param("example") PathologyExample example);

    int updateByExample(@Param("record") Pathology record, @Param("example") PathologyExample example);

    int updateByPrimaryKeySelective(Pathology record);

    int updateByPrimaryKey(Pathology record);

    int deletePathology(List<String> list);
}