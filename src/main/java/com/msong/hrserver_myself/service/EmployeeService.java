package com.msong.hrserver_myself.service;

import com.msong.hrserver_myself.bean.Employee;
import com.msong.hrserver_myself.bean.EmployeeInfo;
import com.msong.hrserver_myself.bean.HrInfo;
import com.msong.hrserver_myself.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper emp;

    public List<Employee> selectAllEmployee(){
       return emp.selectAllEmployee();
    }
    public List<Employee> selectEmployeeByPage(int page){
        int pages=(page-1)*10;
        return emp.selectEmployeeByPage(pages);
    }
    public EmployeeInfo selectEmployeeById(int id ){
        return emp.selectEmployeeById(id);
    }

    public void updateEmployee(EmployeeInfo e){
        emp.updateEmployee(e);


    }
    public int getEmpTotal(){
        return emp.getEmpTotal();
    }
    public void deleteById(int id){
        emp.deleteById(id);
    }
    public List<HrInfo> hrInfoMap(){
        return emp.getHrinfo();
    }
    public List<HrInfo> hrInfoMap02(){
        return emp.getHrinfo02();
    }



}
