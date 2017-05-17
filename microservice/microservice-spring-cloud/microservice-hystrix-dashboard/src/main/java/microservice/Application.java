package microservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by mb on 2017/5/15.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class Application {

    public static void main(String[] args) {

        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
