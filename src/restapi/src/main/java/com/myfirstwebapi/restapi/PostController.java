package restapi.src.main.java.com.myfirstwebapi.restapi;

import org.springframework.web.bubd.annotation.GetMapping;
import org.springframework.web.bubd.annotation.RestController;

@RestController
public class PostController {
    @GetMapping("/hello")
    public String Hello(){
    return "Hello world";
    }
}
