package com.hospMS.mapper;

import com.hospMS.pojo.PathologyAnalysis;
import com.hospMS.pojo.PathologyAnalysisExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PathologyAnalysisMapper {
    int countByExample(PathologyAnalysisExample example);

    int deleteByExample(PathologyAnalysisExample example);

    int deleteByPrimaryKey(Integer pathologyAnalysisId);

    int insert(PathologyAnalysis record);

    int insertSelective(PathologyAnalysis record);

    List<PathologyAnalysis> selectByExample(PathologyAnalysisExample example);

    PathologyAnalysis selectByPrimaryKey(Integer pathologyAnalysisId);

    int updateByExampleSelective(@Param("record") PathologyAnalysis record, @Param("example") PathologyAnalysisExample example);

    int updateByExample(@Param("record") PathologyAnalysis record, @Param("example") PathologyAnalysisExample example);

    int updateByPrimaryKeySelective(PathologyAnalysis record);

    int updateByPrimaryKey(PathologyAnalysis record);
}