package basic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Controller class which handles HTTP Requests
 */
@RestController
public class BasicController {

    /*
     * Base of the application
     */
    @RequestMapping("/")
    public String base() {
        return new String("Spring Boot has started.");
    }

    /*
     * Method to check if Application is up
     */
    @RequestMapping("/hello")
    public String hello() {
        return new String("Hello there!");
    }
}