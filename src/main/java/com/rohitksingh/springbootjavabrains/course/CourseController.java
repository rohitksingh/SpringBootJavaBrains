package com.rohitksingh.springbootjavabrains.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/courses")
    public List<Course> getAllCourse(){
        return courseService.getAllCourses();
    }

    @RequestMapping("/course/{id}")
    public Course getCourse(@PathVariable int id){
       return courseService.getCourse(id);
    }

}
