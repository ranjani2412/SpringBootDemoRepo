package com.another.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
/*
 * Auto scanning not available here since it is a diff pkg. It will auto scan only those pkgs annotated with @SpringBootApplication
 * If you still need to scan use @ComponentScan({"PKG1","PKG2"}) along with the @SpringBootApplication
*/
@RestController
public class CourseController {

    @GetMapping("/course")
    public List<Course> getAllApplicableCourses() {
        return Arrays.asList(new Course("SpringBoot", "SB01", "INSRT01"));
    }

}
