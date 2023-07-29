package com.hty.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.hty.dubbo.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;


    @RequestMapping("/student/count")
    public Integer studentCount(){
        return studentService.queryAllStudentCount();
    }
}
