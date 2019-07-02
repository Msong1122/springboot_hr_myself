package com.msong.hrserver_myself.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Mapper
public interface Test {
    public List<Object> getEmp();
}
