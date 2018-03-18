
package com.hospMS.controller;

import com.hospMS.common.pojo.DataTablesResult;
import com.hospMS.common.pojo.HUIDateGridResult;
import com.hospMS.common.pojo.HospMSResult;
import com.hospMS.pojo.*;
import com.hospMS.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

 /*Created by Chen on 2017/10/16.*/


@Controller
@RequestMapping("/manage/")
public class FieldManageController {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private FieldManageService fieldManageService;


    @RequestMapping(value = "/list/hospitalList",method = RequestMethod.POST)
    @ResponseBody
    private DataTablesResult getHospitalList(int draw,int start,int length){
        DataTablesResult result=fieldManageService.getHospitalList(draw,start,length);
        return result;
    }


    @RequestMapping(value = "/list/diseaseList",method = RequestMethod.POST)
    @ResponseBody
    private DataTablesResult getDiseaseList(int draw,int start,int length){
        DataTablesResult result= fieldManageService.getDiseaseList(draw,start,length);
        return result;
    }

    @RequestMapping(value = "/list/departmentList",method = RequestMethod.POST)
    @ResponseBody
    private DataTablesResult getDepartmentList(int draw,int start,int length){
        DataTablesResult result= fieldManageService.getDepartmentList(draw,start,length);
        return result;
    }

    @RequestMapping(value = "/list/pathologyList",method = RequestMethod.POST)
    private DataTablesResult getPathologyList(int draw,int start,int length){
        DataTablesResult result=fieldManageService.getPathologyList(draw,start,length);
        return result;
    }

    @RequestMapping(value = "/list/sysptomList",method = RequestMethod.POST)
    @ResponseBody
    private DataTablesResult getSysptomList(int draw,int start,int length){
        DataTablesResult result=fieldManageService.getSymptomList(draw,start,length);
        return result;
    }


//    delete
    @RequestMapping(value="/delete/deleteHospital/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
    public HospMSResult deleteHospitalById(@PathVariable("ids") String ids) {
        List<String> list = getList(ids);
        HospMSResult result= fieldManageService.deleteHospital(list);
        return result;
    }

    @RequestMapping(value="/delete/deleteDepart/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
    public HospMSResult deleteDepartById(@PathVariable("ids") String ids) {
        List<String> list = getList(ids);
        HospMSResult result= fieldManageService.deleteDeparts(list);
        return result;
    }

    @RequestMapping(value="/delete/deleteDisease/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
    public HospMSResult deleteDiseaseById(@PathVariable("ids") String ids) {
        List<String> list = getList(ids);
        HospMSResult result= fieldManageService.deleteDisease(list);
        return result;
    }

    @RequestMapping(value="/delete/deletePathology/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
    public HospMSResult deletePathologyById(@PathVariable("ids") String ids) {
        List<String> list = getList(ids);
        HospMSResult result= fieldManageService.deletePathology(list);
        return result;
    }

    @RequestMapping(value="/delete/deleteSymptom/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
    public HospMSResult deleteSymptomById(@PathVariable("ids") String ids) {
        List<String> list = getList(ids);
        HospMSResult result= fieldManageService.deleteSymptom(list);
        return result;
    }


    @RequestMapping(value="/add/addHospital/",method= RequestMethod.POST)
    @ResponseBody
    private HospMSResult addHospital(Hospital hospital){
        HospMSResult result = fieldManageService.addHospital(hospital);
        return result;
    }

    @RequestMapping(value="/add/addDisease/",method= RequestMethod.POST)
    @ResponseBody
    private HospMSResult addDisease(Disease disease){
        HospMSResult result = fieldManageService.addDisease(disease);
        return result;
    }

    @RequestMapping(value="/add/addDepart/",method= RequestMethod.POST)
    @ResponseBody
    private HospMSResult addDepart(Department role){
        HospMSResult result = fieldManageService.addDepart(role);
        return result;
    }

    @RequestMapping(value="/add/addPathology/",method= RequestMethod.POST)
    @ResponseBody
    private HospMSResult addPathology(Pathology pathology){
        HospMSResult result = fieldManageService.addPathology(pathology);
        return result;
    }

    @RequestMapping(value="/add/addSymptom/",method= RequestMethod.POST)
    @ResponseBody
    private HospMSResult addSymptom(Symptom symptom){
        HospMSResult result = fieldManageService.addSymptom(symptom);
        return result;
    }



    @RequestMapping(value="/edit/editHospital/",method= RequestMethod.POST)
    @ResponseBody
    private HospMSResult editHospital(Hospital hospital){
        HospMSResult result = fieldManageService.editHospital(hospital);
        return result;
    }

    @RequestMapping(value="/edit/editDisease/",method= RequestMethod.POST)
    @ResponseBody
    private HospMSResult editDisease(Disease disease){
        HospMSResult result = fieldManageService.editDisease(disease);
        return result;
    }

    @RequestMapping(value="/edit/editDepart/",method= RequestMethod.POST)
    @ResponseBody
    private HospMSResult editDepart(Department role){
        HospMSResult result = fieldManageService.editDepart(role);
        return result;
    }

    @RequestMapping(value="/edit/editPathology/",method= RequestMethod.POST)
    @ResponseBody
    private HospMSResult editPathology(Pathology pathology){
        HospMSResult result = fieldManageService.editPathology(pathology);
        return result;
    }

    @RequestMapping(value="/edit/editSymptom/",method= RequestMethod.POST)
    @ResponseBody
    private HospMSResult editSymptom(Symptom symptom){
        HospMSResult result = fieldManageService.editSymptom(symptom);
        return result;
    }


    public List<String> getList(String id) {
        List<String> list = new ArrayList<String>();
        String[] str = id.split(",");
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }
        return list;
    }

}