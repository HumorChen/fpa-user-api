package cn.programming.service;

import cn.freeprogramming.params.LoginParam;
import cn.freeprogramming.params.ModifySelfInfoParam;
import cn.freeprogramming.params.RegisterParam;
import cn.freeprogramming.params.RetrieveParam;
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
    R login(LoginParam loginParam, String lastOnlineIp);

    /**
     * 注册
     * @param registerParam
     * @return
     */
    R register(RegisterParam registerParam);

    /**
     * 找回密码
     * @param retrieveParam
     * @return
     */
    R retrieve(RetrieveParam retrieveParam);

    /**
     * 修改个人信息
     * @param modifySelfInfoParam
     * @return
     */
    R modifySelfInfo(ModifySelfInfoParam modifySelfInfoParam);
}
