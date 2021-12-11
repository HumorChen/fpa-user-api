package cn.freeprogramming.service.impl;

import cn.freeprogramming.facade.IUserFacade;
import cn.freeprogramming.params.LoginParam;
import cn.freeprogramming.vo.result.R;
import cn.freeprogramming.service.IUserService;
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
    public R login(LoginParam loginParam) {
        return userFacade.login(loginParam);
    }
}
