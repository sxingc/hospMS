package com.hospMS.service;

import com.hospMS.common.pojo.DataTablesResult;
import com.hospMS.common.pojo.HUIDateGridResult;
import com.hospMS.common.pojo.HospMSResult;
import com.hospMS.pojo.*;

import java.util.List;

public interface FieldManageService {

    DataTablesResult getHospitalList(int draw, int start, int length);

    DataTablesResult getDepartmentList(int draw,int start,int length);

    DataTablesResult getDiseaseList(int draw,int start,int length);

    DataTablesResult getPathologyList(int draw,int start,int length);

    DataTablesResult getSymptomList(int draw,int start,int length);


    HospMSResult deleteHospital(List<String> list);

    HospMSResult deleteDeparts(List<String> list);

    HospMSResult deleteDisease(List<String> list);

    HospMSResult deletePathology(List<String> list);

    HospMSResult deleteSymptom(List<String> list);


    HospMSResult addHospital(Hospital hospital);

    HospMSResult addDepart(Department department);

    HospMSResult addDisease(Disease disease);

    HospMSResult addPathology(Pathology pathology);

    HospMSResult addSymptom(Symptom symptom);


    HospMSResult editHospital(Hospital hospital);

    HospMSResult editDepart(Department department);

    HospMSResult editDisease(Disease disease);

    HospMSResult editPathology(Pathology pathology);

    HospMSResult editSymptom(Symptom symptom);

}
