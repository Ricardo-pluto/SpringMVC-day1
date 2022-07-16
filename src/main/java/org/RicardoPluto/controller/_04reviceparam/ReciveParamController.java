package org.RicardoPluto.controller._04reviceparam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@Controller
public class ReciveParamController {
    //方式1 HttpServletRequest 类型转换，需要自己封装对象
    @RequestMapping("/reciveParam01")
    public void reciveParam01(HttpServletRequest request, HttpSession session, HttpServletResponse response)
        throws Exception{
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        //类型转换，封装对象
        System.out.println(name);
        System.out.println(password);
        System.out.println(session);
        response.getWriter().println("very nice"+name+":"+password+".."+session);
    }

    //方式2：属性名，如果名字不一致，可以通过@RequestParam处理，参数只有一个
    @RequestMapping("/reciveParam02")
    public void reciveParam02(@RequestParam("name")String n,String password,HttpServletResponse response)
        throws Exception{
        System.out.println(n);
        System.out.println(password);
        response.getWriter().println("02very nice"+n+":"+password);
    }

    //方式3，JavaBean接收，参数使用
    @RequestMapping("/reviceParam03")
    public void reviceParam03(LoginInfo info,HttpServletResponse response)throws Exception{
        System.out.println(info);
        response.getWriter().println("03 very nice"+info.getName()+":"+info.getPassword());
    }

    //方式4：路径参数
    @RequestMapping("/reviceParam04/{id}")  //reviceParam04/3   获取或删除时使用，只需传递id
    public void reviceParam04(@PathVariable("id")Long id,HttpServletResponse response)
        throws Exception{
        System.out.println(id);
        response.getWriter().println("04 very nice"+id);
    }
}
