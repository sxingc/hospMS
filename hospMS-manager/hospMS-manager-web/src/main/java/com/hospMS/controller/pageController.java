package com.hospMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/*页面跳转
 */

@Controller
public class pageController {

    /*打开首页*/
    @RequestMapping("/")
    public String showIndex(){
        System.out.println("showIndex");
        return "index";
    }

    @RequestMapping("/manage/")
    public String showManage(){
        return "manage";
    }
    /*打开其他页面*/
    @RequestMapping("/manage/list/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    /**
     * @Title: toPage
     * @Description: 二级页面跳转，例如 WEB-INF/jsp/login.jsp
     */
    @RequestMapping(value = "{pageName1}/{pageName2}", method = RequestMethod.GET)
    public ModelAndView toPage(@PathVariable("pageName1") String pageName1, @PathVariable("pageName2") String pageName2) {
        ModelAndView mv = new ModelAndView(pageName1 + "/" + pageName2);
        return mv;
    }

    /**
     * @Title: toPage
     * @Description: 一级页面跳转，例如 WEB-INF/login.jsp
     */
   @RequestMapping(value = "{pageName1}", method = RequestMethod.GET)
    public ModelAndView toPage(@PathVariable("pageName1") String pageName1) {
        ModelAndView mv = new ModelAndView(pageName1);
        return mv;
    }

}