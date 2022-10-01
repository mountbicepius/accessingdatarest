package com.example.accessingdatarest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentSevice {

    @Autowired
    StudentRepository studentRepository;
    public List<Student> getAllStudents() {
        List<Student> students= new ArrayList<Student>();
        studentRepository.findAll().forEach(_stud->students.add(_stud));
        return students;
    }

    public Student getStudentById(int studid) {
        return studentRepository.findById(studid).get();
    }

    public void delete(int studid) {
        studentRepository.deleteById(studid);
    }

    public void saveOrUpdate(Student student) {
        studentRepository.save(student);
    }

}
