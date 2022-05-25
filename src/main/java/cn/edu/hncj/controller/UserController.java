package cn.edu.hncj.controller;

import cn.edu.hncj.pojo.User;
import cn.edu.hncj.service.IUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    public String userLogin(@Param("username")String username, @Param("password")String password, HttpServletRequest request){
        User userLogin= userService.userLogin(username,password);
        if(userLogin==null){
            request.setAttribute("msg","用户名或密码错误！！");
            return "forward:login.jsp";
        }

        return "redirect:success.jsp";
    }
}
