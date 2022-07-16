package org.RicardoPluto.controller._05viewresovler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * 响应界面可以通过返回ModelAndView或String来实现，并且默认是forward，也可以通过视图解析器配置前后缀。
 * 当然如果我们需要做redirect：页面全路径。
 */
@Controller
public class ViewResovlerController {
    //1 通过ModelAndView的viewName返回页面
    @RequestMapping("/viewResovler01")
    public ModelAndView viewResovler01(){
        //return new ModelAndView("/WEB-INF/jsps/_05viewresovler/xxx.jsp");
        return new ModelAndView("_05viewresovler/resovler");
    }
    //2 直接返回String，效果与01相同
    @RequestMapping("/viewResovler02")
    public String viewResovler02(HttpServletResponse response){
        return "_05viewresovler/resovler";
    }

    //返回视图：客户端响应界面，name响应界面有两种，跳转方式：全路径
    //1 服务端请求转发 如果直接响应ModelAndView，默认就是forward，地址不变，可以访问WEB-INF下的资源
    //2 客户端重定向
    @RequestMapping("/viewResolver03")
    public String viewResolver03(){
        return "forward:/WEB-INF/jsps/_05viewresovler/xxx.jsp";
    }
    @RequestMapping("/viewResolve04")
    public ModelAndView viewResolve04(){
        return new ModelAndView("forward:/WEB-INF/jsps/_05viewresovler/xxx.jsp");
    }
    //这里会报错，因为通过重定向跳转到了WEB-INF中的页面，不能直接访问
    @RequestMapping("/viewResolve05")
    public String viewResolve05(){
        return "redirect:/WEB-INF/jsps/_05viewresolver/xxx.jsp";
    }
}
