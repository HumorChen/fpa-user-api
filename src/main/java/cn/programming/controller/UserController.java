package cn.programming.controller;

import cn.freeprogramming.params.LoginParam;
import cn.freeprogramming.vo.result.R;
import cn.programming.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author humorchen
 * @date 2021/12/6 1:21
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public R login(LoginParam loginParam){
        return userService.login(loginParam);
    }
}
