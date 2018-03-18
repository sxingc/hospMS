package com.hospMS.mapper;

import com.hospMS.pojo.Symptom;
import com.hospMS.pojo.SymptomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SymptomMapper {
    int countByExample(SymptomExample example);

    int deleteByExample(SymptomExample example);

    int deleteByPrimaryKey(Integer symptomId);

    int insert(Symptom record);

    int insertSelective(Symptom record);

    List<Symptom> selectByExample(SymptomExample example);

    Symptom selectByPrimaryKey(Integer symptomId);

    int updateByExampleSelective(@Param("record") Symptom record, @Param("example") SymptomExample example);

    int updateByExample(@Param("record") Symptom record, @Param("example") SymptomExample example);

    int updateByPrimaryKeySelective(Symptom record);

    int updateByPrimaryKey(Symptom record);

    int deleteSymptom(List<String> list);
}