package com.qianfeng.springboot2.Controller;
import com.qianfeng.springboot2.Entity.TUser;
import com.qianfeng.springboot2.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author qiujinyao
 * @version 1.0
 * @Date 2019/7/31
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired

    private IUserService userService;
    @RequestMapping("getUserList")

    private String  getUserlist(Model model){
        List<TUser> userList = userService.getUserList();
        model.addAttribute("userList",userList);
        return "user_list";

    }

}
