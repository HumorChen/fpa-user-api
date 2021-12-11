import cn.freeprogramming.dao.RedisDao;
import cn.freeprogramming.UserApiApplication;
import cn.freeprogramming.cache.UserCacheKey;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author humorchen
 * @date 2021/12/8 23:16
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserApiApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestApp {


    @Test
    public void test1(){
//        redisTemplate.opsForValue().set("test","idea test");
//        redisTemplate.opsForValue().set("a","1");
        UserCacheKey userCacheKey = new UserCacheKey(1);
        RedisDao.set(userCacheKey,"hello");
        System.out.println();
        System.out.println("keys："+ RedisDao.keys("*"));
        System.out.println("query:"+RedisDao.get(userCacheKey,String.class));
    }

}
