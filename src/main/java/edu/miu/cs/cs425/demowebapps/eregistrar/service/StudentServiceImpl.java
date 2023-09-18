package edu.miu.cs.cs425.demowebapps.eregistrar.service;

import edu.miu.cs.cs425.demowebapps.eregistrar.model.Student;
import edu.miu.cs.cs425.demowebapps.eregistrar.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService{


    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
    }

    @Override
    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }
}
