package cn.programming.service.impl;

import cn.freeprogramming.facade.IUserFacade;
import cn.freeprogramming.params.LoginParam;
import cn.freeprogramming.params.ModifySelfInfoParam;
import cn.freeprogramming.params.RegisterParam;
import cn.freeprogramming.params.RetrieveParam;
import cn.freeprogramming.vo.result.R;
import cn.programming.service.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author humorchen
 * @date 2021/12/6 1:35
 */
@Service
public class UserServiceImpl implements IUserService {

    @DubboReference
    private IUserFacade userFacade;

    /**
     * 登录
     *
     * @param loginParam
     * @return
     */
    @Override
    public R login(LoginParam loginParam, String lastOnlineIp) {
        return userFacade.login(loginParam, lastOnlineIp);
    }

    @Override
    public R register(RegisterParam registerParam) {
        return userFacade.register(registerParam);
    }

    @Override
    public R retrieve(RetrieveParam retrieveParam) {
        return userFacade.retrieve(retrieveParam);
    }

    @Override
    public R modifySelfInfo(ModifySelfInfoParam modifySelfInfoParam) {
        return userFacade.modifySelfInfo(modifySelfInfoParam);
    }
}
