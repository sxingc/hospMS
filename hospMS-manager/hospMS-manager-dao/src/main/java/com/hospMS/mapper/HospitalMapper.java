package com.hospMS.mapper;

import com.hospMS.pojo.Hospital;
import com.hospMS.pojo.HospitalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HospitalMapper {
    int countByExample(HospitalExample example);

    int deleteByExample(HospitalExample example);

    int deleteByPrimaryKey(Integer hospitalId);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    List<Hospital> selectByExample(HospitalExample example);

    Hospital selectByPrimaryKey(Integer hospitalId);

    int updateByExampleSelective(@Param("record") Hospital record, @Param("example") HospitalExample example);

    int updateByExample(@Param("record") Hospital record, @Param("example") HospitalExample example);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);

    int deleteHospital(List<String> list);
}