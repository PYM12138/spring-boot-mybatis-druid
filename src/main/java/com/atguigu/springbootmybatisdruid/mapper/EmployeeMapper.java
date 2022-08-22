package com.atguigu.springbootmybatisdruid.mapper;

import com.atguigu.springbootmybatisdruid.bean.Employee;

public interface EmployeeMapper {
    public Employee getEmployeeById(Integer id);

    public Integer insertEmployee();

}
