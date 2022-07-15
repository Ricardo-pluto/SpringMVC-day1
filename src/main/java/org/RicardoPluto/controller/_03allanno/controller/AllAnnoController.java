package org.RicardoPluto.controller._03allanno.controller;

import org.RicardoPluto.controller._03allanno.service.IAllAnnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 三层架构：
 *   用户访问controller--->Service--->Dao
 *  ================
 *  1 controller注解:普通类+@RequestMapping
 *   1) 开启注解支持
 *    开启springmvc注解支持，说白了就是支持@RequestMapping这种注解实现controller
 *     <mvc:annotation-driven></mvc:annotation-driven>
 *   2）普通类+@RequestMapping
 *  2 controller，Service，到通过主键@Controller,@Service,@Repository交给Spring管理
 *   1) 配置扫描组件包 才能识别注解
 *      <context:componentScan basePackage></context:componentScan>
 *   2）写三层组件+@Controller,@Service,@Repository
 *  3 以来注入也有注解
 *     @Autowired @Resouce
 */
@Controller
public class AllAnnoController {
    @Autowired
    private IAllAnnoService allAnnoService;
    @RequestMapping("/allAnno")
    public ModelAndView allAnno(){
        String viewName = "/WEB-INF/jsps/_03anno/xxx.jsp";
        return new ModelAndView(viewName,"msg","欢迎欢迎");
    }
}
