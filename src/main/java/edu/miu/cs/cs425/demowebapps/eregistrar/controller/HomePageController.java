package edu.miu.cs.cs425.demowebapps.eregistrar.controller;

import edu.miu.cs.cs425.demowebapps.eregistrar.model.Student;
import edu.miu.cs.cs425.demowebapps.eregistrar.repository.StudentRepository;
import edu.miu.cs.cs425.demowebapps.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomePageController {

    @Autowired
    private StudentService studentService;



    @GetMapping(value = {"/" ,"/eRegistrar" ,"/eRegistrar/home"})
    public String displayHomePage(){
        return "home/index";
    }

    @GetMapping(value = "/eRegistrar/studentForm")
    public String showStudentForm(Model model){
        model.addAttribute("student", new Student());

        return "home/studentForm";
    }

    @GetMapping(value = "/eRegistrar/studentList")
    public String showStudentList(Model model){

        model.addAttribute("studentList",studentService.getAllStudent());
        return "home/studentList";
    }

    @GetMapping(value = "/eRegistrar/edit/{studentId}")
    public String showUpdateForm(@PathVariable("studentId") Long studentId, Model model) {
        Student student = studentService.findById(studentId);
        model.addAttribute("student", student);
        return "home/editStudent";
    }



}
