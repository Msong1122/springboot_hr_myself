package com.msong.hrserver_myself.controller;

import com.alibaba.fastjson.JSON;
import com.msong.hrserver_myself.bean.Employee;
import com.msong.hrserver_myself.bean.EmployeeInfo;
import com.msong.hrserver_myself.bean.HrInfo;
import com.msong.hrserver_myself.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping ("/emp")
public class EmpController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/selectAllEmployee")
    public List<Employee> selectAllEmployee(){
        return employeeService.selectAllEmployee();
    }
    @GetMapping("/selectEmployeeByPage")
    public List<Employee> selectEmployeeByPage(@RequestParam(value = "page",required = false) Integer page){
        if (null == page) page=1;

        return employeeService.selectEmployeeByPage(page);


    }
    @GetMapping("/selectEmployeeById")
    public EmployeeInfo selectEmployeeById( int id){
        return employeeService.selectEmployeeById(id);
    }

    @PostMapping("/updateEmployee")
    public void updateEmployee(@RequestBody String emp){

        EmployeeInfo employeeInfo = JSON.parseObject(emp, EmployeeInfo.class);
        System.out.println( employeeInfo.getName());
        System.out.println( employeeInfo.getBirthday());
        System.out.println( employeeInfo.getWedlock());
        System.out.println(employeeInfo.getPosition().getName());
        employeeService.updateEmployee(employeeInfo);


    }
    @GetMapping("/getEmpTotal")
    public int getEmpTotal(){
        return employeeService.getEmpTotal();
    }

    //    @PostMapping("/deleteById")
//    public String deleteByid(@RequestParam("id") int id){
//        System.out.println(id);
//        employeeService.deleteById(id);
//        return "ok";
//    }
    @PostMapping("/deleteById")
    public String deleteById(@RequestParam("id")  int id){
        System.out.println(id);

        employeeService.deleteById(id);
        return "ok";
    }

    @GetMapping("/getHrInfo")
    public List<HrInfo> getHrInfo(){
        return employeeService.hrInfoMap();
    }
    @GetMapping("/getHrInfo02")
    public List<HrInfo> getHrInfo02(){
        return employeeService.hrInfoMap02();
    }



}
