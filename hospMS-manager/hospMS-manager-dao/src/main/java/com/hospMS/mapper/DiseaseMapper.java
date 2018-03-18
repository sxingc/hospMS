package com.hospMS.mapper;

import com.hospMS.pojo.Disease;
import com.hospMS.pojo.DiseaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiseaseMapper {
    int countByExample(DiseaseExample example);

    int deleteByExample(DiseaseExample example);

    int deleteByPrimaryKey(Integer diseaseId);

    int insert(Disease record);

    int insertSelective(Disease record);

    List<Disease> selectByExample(DiseaseExample example);

    Disease selectByPrimaryKey(Integer diseaseId);

    int updateByExampleSelective(@Param("record") Disease record, @Param("example") DiseaseExample example);

    int updateByExample(@Param("record") Disease record, @Param("example") DiseaseExample example);

    int updateByPrimaryKeySelective(Disease record);

    int updateByPrimaryKey(Disease record);

    int deleteDisease(List<String> list);
}