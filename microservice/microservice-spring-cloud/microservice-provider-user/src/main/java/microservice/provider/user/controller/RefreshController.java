package microservice.provider.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mb on 2017/5/19.
 */
@RestController
@RefreshScope
public class RefreshController {


    @GetMapping("/hello")
    public String hello() {
        return "success";
    }
}
