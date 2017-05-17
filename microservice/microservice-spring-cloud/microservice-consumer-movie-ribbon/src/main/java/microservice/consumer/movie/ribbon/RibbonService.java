package microservice.consumer.movie.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * Created by mb on 2017/5/15.
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;


    public User getUserById(Long id) {
        // http://服务提供者的serviceId/url
        return restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
    }

}
