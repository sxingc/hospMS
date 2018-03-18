package com.hospMS.mapper;

import com.hospMS.pojo.Diaginfo;

import java.util.List;

import com.hospMS.pojo.DiaginfoExample;
import org.apache.ibatis.annotations.Param;

public interface DiaginfoMapper {
    int countByExample(DiaginfoExample example);

    int deleteByExample(DiaginfoExample example);

    int deleteByPrimaryKey(Integer diaginfoId);

    int insert(Diaginfo record);

    int insertSelective(Diaginfo record);

    List<Diaginfo> selectByExample(DiaginfoExample example);

    Diaginfo selectByPrimaryKey(Integer diaginfoId);

    int updateByExampleSelective(@Param("record") Diaginfo record, @Param("example") DiaginfoExample example);

    int updateByExample(@Param("record") Diaginfo record, @Param("example") DiaginfoExample example);

    int updateByPrimaryKeySelective(Diaginfo record);

    int updateByPrimaryKey(Diaginfo record);
}