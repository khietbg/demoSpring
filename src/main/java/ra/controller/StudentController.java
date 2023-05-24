package ra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.model.service.StudentService;
import ra.model.untity.Student;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("")
    public List<Student> getAllStudent(){
       return studentService.findAll();
    }

}
