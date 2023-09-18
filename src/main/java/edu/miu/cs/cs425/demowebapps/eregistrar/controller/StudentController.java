package edu.miu.cs.cs425.demowebapps.eregistrar.controller;

import edu.miu.cs.cs425.demowebapps.eregistrar.model.Student;
import edu.miu.cs.cs425.demowebapps.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController()
public class StudentController {


    @Autowired
    private StudentService studentService;



    @PostMapping(value = "/eRegistrar/student/save")

    public String addStudent( Student student, BindingResult result, Model model) {

        studentService.saveStudent(student);
        return "redirect:eRegistrar/studentList";
    }

    @PostMapping("/eRegistrar/student/update/{studentId}")
    public String updateUser(@PathVariable("studentId") Long studentId, @Validated Student student,
                             BindingResult result, Model model) {

        studentService.saveStudent(student);
        return "/home/studentList";
    }

    @GetMapping("/delete/{studentId}")
    public String deleteUser(@PathVariable("studentId") Long studentId, Model model) {
        Student student = studentService.findById(studentId);
        studentService.deleteStudent(student);
        return "redirect:/index";
    }


}
