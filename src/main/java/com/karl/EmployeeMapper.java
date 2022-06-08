package com.karl;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 模块描述: 【】
 *
 * @Author: Mr. YuBang.Xu
 * @Date: 2022/6/1 16:36
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Mapper
public interface EmployeeMapper {

    /**
     * id
     *
     * @param id
     * @return
     */
    Employee getById(@Param("id") Long id);
}