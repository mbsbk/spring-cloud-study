package microservice.provider.user.controller;

import microservice.provider.user.entity.User;
import microservice.provider.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mb on 2017/5/14.
 */
@RestController
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public User findById(@PathVariable long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 本地服务实例的信息
     * @return
     */
    @GetMapping("/instance-info")
    public ServiceInstance showInfo() {
        ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
        return localServiceInstance;
    }
}
