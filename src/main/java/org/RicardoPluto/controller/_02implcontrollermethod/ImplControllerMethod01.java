package org.RicardoPluto.controller._02implcontrollermethod;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImplControllerMethod01 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse Response) throws Exception {
        //接收，封装参数
        String name = request.getParameter("name");
        System.out.println(name);

        //调用业务逻辑
        ModelAndView mv = new ModelAndView();
        String msg = "zs";
        //添加模型数据
        mv.addObject("msg",msg);
        //添加视图
        mv.setViewName("/WEB-INF/jsps/_02implcontrollermethod/method01.jsp");

        //返回页面或响应数据
        return mv;
    }
}
