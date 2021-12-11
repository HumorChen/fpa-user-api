package cn.programming.controller;

import cn.freeprogramming.params.LoginParam;
import cn.freeprogramming.params.ModifySelfInfoParam;
import cn.freeprogramming.params.RegisterParam;
import cn.freeprogramming.params.RetrieveParam;
import cn.freeprogramming.vo.result.R;
import cn.programming.service.IUserService;
import com.netflix.ribbon.proxy.annotation.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author humorchen chenxingxing
 * @date 2021/12/6 1:21 2021/12/11 21:13
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public R login(@RequestBody LoginParam loginParam){
        String onlineIp = "";
        return userService.login(loginParam,onlineIp);
    }

    @PostMapping("register")
    public R register(@RequestBody RegisterParam registerParam) {

        return userService.register(registerParam);
    }

    @PutMapping("userinfo")
    public R modifySelfInfo(@RequestBody ModifySelfInfoParam modifySelfInfoParam) {

        return userService.modifySelfInfo(modifySelfInfoParam);
    }

    @PatchMapping("retrieve")
    public R retrieve(@RequestBody RetrieveParam retrieveParam) {

        return userService.retrieve(retrieveParam);
    }
}
