package andbyprmn.packagingspringdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackagingController {

    @RequestMapping("/packaging")
    public String hello(){
        return "Hello, geiys!";
    }
}
