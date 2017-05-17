package microservice.consumer.movie.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by mb on 2017/5/15.
 */


@FeignClient(name = "microservice-provider-user",fallback = HystrixClientFallBack.class)
public interface UserFeignClient {



    @RequestMapping("/{id}")
    User getUserById(@RequestParam("id") long id);


}

