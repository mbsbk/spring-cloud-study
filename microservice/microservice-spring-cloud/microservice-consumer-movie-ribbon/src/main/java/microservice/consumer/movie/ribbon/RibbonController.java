package microservice.consumer.movie.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mb on 2017/5/15.
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;


    @GetMapping("/ribbon/{id}")
    public User getUserById(@PathVariable("id") long id) {
        return ribbonService.getUserById(id);
    }

}
