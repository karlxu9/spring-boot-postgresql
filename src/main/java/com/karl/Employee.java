package com.karl;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * 模块描述: 【】
 *
 * @Author: Mr. YuBang.Xu
 * @Date: 2022/6/1 16:31
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {

    Long id;

    String name;

    Integer age;

}
