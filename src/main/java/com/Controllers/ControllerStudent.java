package com.Controllers;

import com.JPARepositories.IStudentRepository;
import com.Model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/Students")
public class ControllerStudent {

   IStudentRepository studentRepository ;


    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id")  String id ) {
        Optional<Student> student = studentRepository.findById(id);
        return student.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
