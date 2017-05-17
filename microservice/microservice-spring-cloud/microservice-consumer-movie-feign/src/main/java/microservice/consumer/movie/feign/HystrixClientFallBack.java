package microservice.consumer.movie.feign;

import org.springframework.stereotype.Component;

/**
 * Created by mb on 2017/5/15.
 */
@Component
public class HystrixClientFallBack implements UserFeignClient {

    @Override
    public User getUserById(long id) {
        System.out.println("调用服务失败");
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }
}
