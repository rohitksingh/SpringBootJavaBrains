package com.rohitksingh.springbootjavabrains.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public class CourseService{

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }

    public Course getCourse(int id){
        Course course = null;
        course = (courseRepository.findById(id)!=null) ? course : null;
        return course;
    }

}
