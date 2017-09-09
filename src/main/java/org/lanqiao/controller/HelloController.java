package org.lanqiao.controller;

import org.lanqiao.bean.User;
import org.lanqiao.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 2017/9/1.
 */
@Controller    //告诉spring，这个类是一个controller
@RequestMapping("/test")   //请求的地址
public class HelloController {
//    @Resource
    private IUserService userService;
    @RequestMapping("/hello")
    public String hello()
    {
        System.out.println("进入了post方法");
        List<User> userList=userService.getAllUser();

        return "hello";
    }
    @RequestMapping("/test.do")
    public String test(){
        //进行一些业务处理
        return "redirect:/test/hello.do";

    }
    @RequestMapping("/forTest.do")
    public String forwardTest01(){
        //进行一些业务处理
        System.out.println("进行了业务处理");
        return "forward:/hello.jsp";

    }


    @RequestMapping("/forwardTest.do")
    public ModelAndView forwardTest02(){
        Map map=new HashMap();
        map.put("name","lizq");
        return new ModelAndView("forward:/hello.jsp",map);

    }


}
