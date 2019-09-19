package cn.bdqn.controller;

import cn.bdqn.pojo.Users;
import cn.bdqn.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UsersController {
    @Resource
    private UsersService usersService;

    //查询所有
    @RequestMapping(value = "/login")
    public String showList(HttpSession session) {
        List<Users> users = usersService.getUsers();
        session.setAttribute("users", users);
        System.out.println("==============================查询");
        return "list";
    }

    // 新增
    @RequestMapping(value = "/add")
    public String show(Users users, HttpSession session) {
        usersService.addUsers(users);
        System.out.println("==============================新增");
        return "redirect:login";
    }

    //删除
    @RequestMapping("/delete")
    public String showDelete(int id) {
        usersService.deleteUsers(id);
        System.out.println("==============================删除");
        return "redirect:login";
    }

    //根据id得到对象跳转修改界面
    @RequestMapping("/getUsers")
    public String showGetUsers(int id, Model model) {
        System.out.println("==============================根据id得到对象跳转修改界面");
        Users usersById = usersService.getUsersById(id);
        model.addAttribute("usersById", usersById);
        return "update";
    }

    //修改
    @RequestMapping("/update")
    public String showupdate(Users users) {
        System.out.println("==============================修改");
        usersService.updateUsers(users);
        return "redirect:login";
    }
}
