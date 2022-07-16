package org.RicardoPluto.controller._06pageGetParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

@Controller
public class PageGetParamController {
    //方式1   ModelAndView
    @RequestMapping("/data01")
    public ModelAndView data01(){
        ModelAndView mv = new ModelAndView();
        String viewName = "_06pagegetparam/xxx";
        mv.setViewName(viewName);
        //传递数据到页面
        mv.addObject("data",new User(1L,"zs"));
        mv.addObject("datas", Arrays.asList(new User(2L,"zs"),new User(3L,"zs")));
        return mv;
    }
    //方式2 servlet原始方式
    @RequestMapping("/data02")
    public void data02(HttpServletRequest request, HttpServletResponse response)throws Exception{
        request.setAttribute("data", new User(1L,"zs"));
        request.setAttribute("datas", Arrays.asList(new User(1L,"zs"),
                new User(2L,"ls"),new User(3L,"ww")));
        request.getRequestDispatcher("/WEB-INF/jsps/_06pagegetparam/xxx.jsp").forward(request, response);
    }

    //方式3   通过Model获取，建议使用
    @RequestMapping("/data03")
    public String data03(Model model)throws Exception{
        model.addAttribute("data",new User(1L,"zs"));
        model.addAttribute("datas",Arrays.asList(new User(1L,"zs"),new User(2L,"ls")));
        return "_06pagegetparam/xxx";
    }

}
