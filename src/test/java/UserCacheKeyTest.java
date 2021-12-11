import cn.freeprogramming.cache.UserCacheKey;

/**
 * @author humorchen
 * @date 2021/12/11 23:21
 */
public class UserCacheKeyTest {

    public static void main(String[] args) {
        UserCacheKey userCacheKey = new UserCacheKey(1);
        System.out.println(userCacheKey.getPrefix());
        System.out.println(userCacheKey.getSuffix());
        System.out.println(userCacheKey.getKey());
    }
}
