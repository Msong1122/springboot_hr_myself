package com.msong.hrserver_myself.mapper;

import com.msong.hrserver_myself.bean.Employee;
import com.msong.hrserver_myself.bean.EmployeeInfo;
import com.msong.hrserver_myself.bean.HrInfo;
import com.msong.hrserver_myself.bean.Time;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeMapper {
    public List<Employee> selectAllEmployee();
    public List<Employee> selectEmployeeByPage(int page);
    public EmployeeInfo selectEmployeeById(int id);
    public int updateEmployee(EmployeeInfo  empInfo);
    public int getEmpTotal();
//    public void deleteById(@Param("id") int id);
    public void deleteById( int id);
    public String editEmp();
    public List<HrInfo> getHrinfo();
    public List<HrInfo> getHrinfo02();

    //测试类容
    public Time testTime();
}
