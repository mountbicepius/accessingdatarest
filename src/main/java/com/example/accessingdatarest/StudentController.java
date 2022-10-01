package com.example.accessingdatarest;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  

@RestController
public class StudentController {
    @Autowired
    StudentSevice studentService;  
    @GetMapping("/student")
    private List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/student/{studid}")
    private Student getStudentById(@PathVariable("studid") int studid){
        return studentService.getStudentById(studid);
    }
    @DeleteMapping("/student/{studid}")
    private void deleteBook(@PathVariable("studid") int studid){
        studentService.delete(studid);
    }
    @PostMapping("/student")
    private int saveBook(@RequestBody Student student){
        studentService.saveOrUpdate(student);
        return student.getStudid();
    }
    @PutMapping("/student")
    private Student update(@RequestBody Student student){
        studentService.saveOrUpdate(student);
        return student;
    }  
}