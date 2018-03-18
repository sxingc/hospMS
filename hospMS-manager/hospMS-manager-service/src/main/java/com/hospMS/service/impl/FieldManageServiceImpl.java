package com.hospMS.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospMS.common.pojo.DataTablesResult;
import com.hospMS.common.pojo.HUIDateGridResult;
import com.hospMS.common.pojo.HospMSResult;
import com.hospMS.mapper.*;
import com.hospMS.pojo.*;
import com.hospMS.service.FieldManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FieldManageServiceImpl implements FieldManageService {
    @Autowired
    private HospitalMapper hospitalMapper;
    @Autowired
    private DiseaseMapper diseaseMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private PathologyMapper pathologyMapper;
    @Autowired
    private SymptomMapper symptomMapper;


    @Override
    public DataTablesResult getHospitalList(int draw, int start, int length) {
        Integer page_num=(start/length)+1;
        PageHelper.startPage(page_num,length);
        HospitalExample example=new HospitalExample();
        List<Hospital> list=hospitalMapper.selectByExample(example);
        PageInfo<Hospital> pageInfo = new PageInfo<Hospital>(list);
        int recordsTotal=(int) pageInfo.getTotal();
        DataTablesResult result=new DataTablesResult(draw,recordsTotal,recordsTotal,pageInfo.getList());
        return result;
    }

    @Override
    public DataTablesResult getDepartmentList(int draw, int start, int length) {
        Integer page_num=(start/length)+1;
        PageHelper.startPage(page_num,length);
        DepartmentExample example=new DepartmentExample();
        List<Department> list=departmentMapper.selectByExample(example);
        PageInfo<Department> pageInfo = new PageInfo<Department>(list);
        int recordsTotal=(int) pageInfo.getTotal();
        DataTablesResult result=new DataTablesResult(draw,recordsTotal,recordsTotal,pageInfo.getList());
        return result;
    }

    @Override
    public DataTablesResult getDiseaseList(int draw, int start, int length) {
        Integer page_num=(start/length)+1;
        PageHelper.startPage(page_num,length);
        DiseaseExample example=new DiseaseExample();
        List<Disease> list=diseaseMapper.selectByExample(example);
        PageInfo<Disease> pageInfo = new PageInfo<Disease>(list);
        int recordsTotal=(int) pageInfo.getTotal();
        DataTablesResult result=new DataTablesResult(draw,recordsTotal,recordsTotal,pageInfo.getList());
        return result;
    }

    @Override
    public DataTablesResult getPathologyList(int draw, int start, int length) {
        Integer page_num=(start/length)+1;
        PageHelper.startPage(page_num,length);
        PathologyExample example=new PathologyExample();
        List<Pathology> list=pathologyMapper.selectByExample(example);
        PageInfo<Pathology> pageInfo = new PageInfo<Pathology>(list);
        int recordsTotal=(int) pageInfo.getTotal();
        DataTablesResult result=new DataTablesResult(draw,recordsTotal,recordsTotal,pageInfo.getList());
        return result;
    }

    @Override
    public DataTablesResult getSymptomList(int draw, int start, int length) {
        Integer page_num=(start/length)+1;
        PageHelper.startPage(page_num,length);
        SymptomExample example=new SymptomExample();
        List<Symptom> list=symptomMapper.selectByExample(example);
        PageInfo<Symptom> pageInfo = new PageInfo<Symptom>(list);
        int recordsTotal=(int) pageInfo.getTotal();
        DataTablesResult result=new DataTablesResult(draw,recordsTotal,recordsTotal,pageInfo.getList());
        return result;
    }


//    delete



    @Override
    public HospMSResult deleteHospital(List<String> list) {
        hospitalMapper.deleteHospital(list);
        return HospMSResult.ok();
    }

    @Override
    public HospMSResult deleteDeparts(List<String> list) {
        departmentMapper.deleteDeparts(list);
        return HospMSResult.ok();
    }

    @Override
    public HospMSResult deleteDisease(List<String> list) {
        diseaseMapper.deleteDisease(list);
        return HospMSResult.ok();
    }

    @Override
    public HospMSResult deletePathology(List<String> list) {
        pathologyMapper.deletePathology(list);
        return HospMSResult.ok();
    }

    @Override
    public HospMSResult deleteSymptom(List<String> list) {
        symptomMapper.deleteSymptom(list);
        return HospMSResult.ok();
    }

//    add

    @Override
    public HospMSResult addHospital(Hospital hospital) {
        hospital.setHospitalId(0);
        hospitalMapper.insert(hospital);
        return HospMSResult.ok();
    }

    @Override
    public HospMSResult addDepart(Department department) {
        department.setDepartId(0);
        departmentMapper.insert(department);
        return HospMSResult.ok();
    }

    @Override
    public HospMSResult addDisease(Disease disease) {
        disease.setDiseaseId(0);
        diseaseMapper.insert(disease);
        return HospMSResult.ok();
    }

    @Override
    public HospMSResult addPathology(Pathology pathology) {
        pathology.setDiseaseId(0);
        pathologyMapper.insert(pathology);
        return HospMSResult.ok();
    }

    @Override
    public HospMSResult addSymptom(Symptom symptom) {
        symptom.setPathologyId(0);
        symptomMapper.insert(symptom);
        return HospMSResult.ok();
    }

//    edit

    @Override
    public HospMSResult editHospital(Hospital hospital) {
        hospitalMapper.updateByPrimaryKey(hospital);
        return HospMSResult.ok();
    }

    @Override
    public HospMSResult editDepart(Department department) {
        departmentMapper.updateByPrimaryKey(department);
        return HospMSResult.ok();
    }

    @Override
    public HospMSResult editDisease(Disease disease) {
        diseaseMapper.updateByPrimaryKey(disease);
        return HospMSResult.ok();
    }

    @Override
    public HospMSResult editPathology(Pathology pathology) {
        pathologyMapper.updateByPrimaryKey(pathology);
        return HospMSResult.ok();
    }

    @Override
    public HospMSResult editSymptom(Symptom symptom) {
        symptomMapper.updateByPrimaryKey(symptom);
        return HospMSResult.ok();
    }
}
