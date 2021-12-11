package cn.freeprogramming.service;

import cn.freeprogramming.params.LoginParam;
import cn.freeprogramming.vo.result.R;

/**
 * 登录服务
 * @Author humorchen
 * @Date 2021/12/6
 */
public interface IUserService {
    /**
     * 登录
     * @param loginParam
     * @return
     */
    R login(LoginParam loginParam);
}
