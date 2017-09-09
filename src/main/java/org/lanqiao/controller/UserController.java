package org.lanqiao.controller;

import org.lanqiao.bean.RtnObj;
import org.lanqiao.bean.User;
import org.lanqiao.bean.UserList;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//@WebServlet(value = "/UserServlet")//Servlet的路径
@Controller    //告诉spring,这个类是一个controller
@RequestMapping("/user")  //请求的地址
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("/UserServlet.do")//请求的地址
    public String  reg(User user){
        System.out.println(user);
        return "result";
    }

    //    自定义混合对象
    @RequestMapping("/myFixObj.do")
    @ResponseBody    //响应体
    public String myFixObj(RtnObj rtnObj){
        return  rtnObj.toString();
    }

    //List绑定
@RequestMapping("/myList.do")
@ResponseBody
 public  String myList(UserList userList)
 {
     return userList.toString();
 }

    //查询所有
    @RequestMapping("/all.do")
    @ResponseBody
    public List<User> getAllUser()
    {
        List<User> list=userService.getAllUser();
      /*  //创建模型和视图对象
        ModelAndView modelAndView=new ModelAndView("showStu");
        //添加模型数据
        modelAndView.addObject("userList",list);*/
        return list;
    }
   //根据条件查询(只有满足条件就查询)
    @RequestMapping("/Condition.do")
    public ModelAndView getUserByCondition(User user)
    {
        System.out.println("得到的对象为"+user);
        List<User> list=userService.getUserByCondition(user);
        Map map=new HashMap();
        map.put("userList",list);
        return new ModelAndView("showStu",map);
    }
    //根据条件查询
    @RequestMapping("/condition.do")
    public ModelAndView findUserByCondition(User user)
    {
        System.out.println("得到的对象为"+user);
        List<User> list=userService.findUserByCondition(user);
        Map map=new HashMap();
        map.put("userList",list);
        return new ModelAndView("showStu",map);
    }

    //根据id获取某一个用户

    @RequestMapping("/findId.do")
    @ResponseBody
    public User getUserById(int id)
    {
        User user=userService.getUserById(id);
        return user;

    }

    /*@RequestMapping(value="/{id}",method= RequestMethod.GET)
    @ResponseBody
    public User getUserById(@PathVariable Integer id)
    {
         User user=userService.getUserById(id);
         return user;

    }*/

    //根据id删除某个用户

  @RequestMapping("/del.do")
    @ResponseBody
    public int delUserById(int id)
    {
        return userService.delUserById(id);

    }


/*
    @RequestMapping(value="/{id}",method= RequestMethod.DELETE)
    @ResponseBody
    public int delUserById(@PathVariable Integer id)
    {
        return userService.delUserById(id);
    }
*/
    //添加一个用户
@RequestMapping("/add.do")
@ResponseBody
public int addUser(User user){
    return userService.addUser(user);
}

  /*
    @RequestMapping(value="",method=RequestMethod.POST)
    @ResponseBody
    public int addUser(@RequestBody User user){
        return userService.addUser(user);
    }
*//*
    //更新用户
  @RequestMapping("/up.do")
  @ResponseBody
  public int updateUser(@RequestBody User user)
  {
      return userService.updateUserById(user);
  }

   *//*
    @RequestMapping(value="",method=RequestMethod.POST)
    @ResponseBody
    public int updateUser(@RequestBody User user)
    {
      return userService.updateUserById(user);
    }
*//*
*/
}
