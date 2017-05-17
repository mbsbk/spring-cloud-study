package microservice.consumer.movie.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mb on 2017/5/15.
 */
@RestController
public class FeignController {


    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/feign/{id}")
    User getUserById(@PathVariable long id) {
        return userFeignClient.getUserById(id);
    }

}
