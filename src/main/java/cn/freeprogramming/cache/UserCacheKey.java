package cn.freeprogramming.cache;

/**
 * @author humorchen
 * @date 2021/12/11 23:11
 */
public class UserCacheKey extends ICacheKey {

    private Integer userId;

    public UserCacheKey(Integer userId) {
        this.userId = userId;
    }

    /**
     * 设置后缀（子类必须实现）
     */
    @Override
    public String getSuffix() {
        return userId + "";
    }

}
