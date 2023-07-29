package com.hty.dubbot.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.hty.dubbo.service.StudentService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Override
    public Integer queryAllStudentCount() {
        return 1024;
    }
}