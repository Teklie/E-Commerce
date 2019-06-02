package se.chalmers.ECommerce.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndPoints {
        @RequestMapping("/course")
    public Course getEndPoint(@RequestParam(value = "name", defaultValue = "Introduction to spring boot", required = false) String name,
            @RequestParam(value = "chapteCount", defaultValue = "4", required = false) int chapterCount){

        return new Course(name, chapterCount);
    }
}
