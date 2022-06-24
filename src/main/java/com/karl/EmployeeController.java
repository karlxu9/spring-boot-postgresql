package com.karl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 模块描述: 【】
 *
 * @Author: Mr. YuBang.Xu
 * @Date: 2022/6/1 16:37
 * @since: 1.8.0
 * @version: 1.0.0
 */
@RestController
@RequestMapping(value = "/employee/")
public class EmployeeController {
    @Resource
    private EmployeeMapper employeeMapper;

    @GetMapping(value = "getById")
    public Employee getById(@RequestParam(value = "id") Long id) {
        if(id == 3L) {
            throw new RuntimeException("asasas");
        }
        return employeeMapper.getById(id);
    }

    public static void main(String[] args) {
    }

}
