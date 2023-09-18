package edu.miu.cs.cs425.demowebapps.eregistrar.service;


import edu.miu.cs.cs425.demowebapps.eregistrar.model.Student;

import java.util.List;

public interface StudentService {

   void saveStudent(Student student);

   List<Student> getAllStudent();

   Student findById(Long id);

   void deleteStudent(Student student);

}
