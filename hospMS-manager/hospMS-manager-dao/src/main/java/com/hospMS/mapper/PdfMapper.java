package com.hospMS.mapper;

import com.hospMS.pojo.Pdf;
import com.hospMS.pojo.PdfExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PdfMapper {
    int countByExample(PdfExample example);

    int deleteByExample(PdfExample example);

    int deleteByPrimaryKey(Integer pdfId);

    int insert(Pdf record);

    int insertSelective(Pdf record);

    List<Pdf> selectByExample(PdfExample example);

    Pdf selectByPrimaryKey(Integer pdfId);

    int updateByExampleSelective(@Param("record") Pdf record, @Param("example") PdfExample example);

    int updateByExample(@Param("record") Pdf record, @Param("example") PdfExample example);

    int updateByPrimaryKeySelective(Pdf record);

    int updateByPrimaryKey(Pdf record);
}