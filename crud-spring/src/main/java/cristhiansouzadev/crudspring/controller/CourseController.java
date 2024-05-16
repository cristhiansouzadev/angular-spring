package cristhiansouzadev.crudspring.controller;

import org.springframework.web.bind.annotation.RestController;

import cristhiansouzadev.crudspring.model.Course;
import cristhiansouzadev.crudspring.repository.CourseRepository;
import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }
}
