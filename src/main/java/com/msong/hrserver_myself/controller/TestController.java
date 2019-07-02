package com.msong.hrserver_myself.controller;

import com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlDeallocatePrepareStatement;
import com.msong.hrserver_myself.bean.Time;
import com.msong.hrserver_myself.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    EmployeeMapper employeeMapper;
    @GetMapping("/time")
    public void testTime()  {
        Time time = employeeMapper.testTime();
        Date timestamp = time.getTimestamp();
        System.out.println("ok!");
        System.out.println(MysqlDeallocatePrepareStatement.class.getResource("/"));
    }
}
