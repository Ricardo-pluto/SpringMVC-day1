package org.RicardoPluto.controller._02implcontrollermethod;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ImplControllerMethod02 implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接收参数
        String name = request.getParameter("name");
        System.out.println(name);
        //调用业务逻辑
        //返回页面或响应数据
        request.setAttribute("msg","zs");
        request.getRequestDispatcher("/WEB-INF/jsps/02implcontrollermethod/method02.jsp").forward(request,response);

    }
}
