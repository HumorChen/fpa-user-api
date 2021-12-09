import cn.programming.UserApiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author humorchen
 * @date 2021/12/8 23:16
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserApiApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestApp {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test1(){
//        redisTemplate.opsForValue().set("test","idea test");
//        redisTemplate.opsForValue().set("a","1");
        System.out.println("查询结果："+redisTemplate.keys("*"));
    }

}
