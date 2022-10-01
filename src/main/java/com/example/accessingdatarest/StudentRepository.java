package com.example.accessingdatarest;

import org.springframework.data.repository.CrudRepository;  

//repository that extends CrudRepository  
public interface StudentRepository extends CrudRepository<Student, Integer>{
      
}  