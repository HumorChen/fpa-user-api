package cn.freeprogramming.controller;

import cn.freeprogramming.params.LoginParam;
import cn.freeprogramming.vo.result.R;
import cn.freeprogramming.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
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
    public R login(@RequestBody @Validated LoginParam loginParam){
        return userService.login(loginParam);
    }

    @RequestMapping("test")
    @Cacheable(key = "#id")
    public R find(long id){
        return R.success("cache success");
    }


}
