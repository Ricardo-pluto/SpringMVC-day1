package org.RicardoPluto.controller._02implcontrollermethod;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
实现controller N多种方式之一
   1 实现controller接口，到时候通过地址匹配到这个类，发现它实现Controller就会默认
    调用handleRequest
 * 2实现HttpRequestHandler接口：通过地址找到该类以后，发现实现HttpRequestHandler接口，就调用handleRequest来处理请求
 * 3： 实现controller三种方式：第三种普通类+注解
 *  优点：一个domain对应一个controller，不像上面的两种方式，要分别为增删改查等操作单独配置controller
 */
@RequestMapping("/employee")
public class ImplControllerMethod03 {
    @RequestMapping("/add")
    public ModelAndView add(){
        return new ModelAndView("/webapp/WEB-INF/jsps/_02implcontrollermethod/method03.jsp");
    }
    @RequestMapping("/del")
    public ModelAndView del(){
        return new ModelAndView("/webapp/WEB-INF/jsps/_02implcontrollermethod/method03.jsp");
    }
    //...
}
