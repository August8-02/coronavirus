package com.sanley.coronavirus.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/* *
 *
 * Bean层也叫model层/模型层/entity层/实体层：就是数据库表的映射实体类，存放POJO对象（简单的Java对象，实际就是普通JavaBeans）;
 * 【我的理解：就是用来存数据库各个表对应的数据】
 */
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Authentication {
    private int id;
    private String description;
    private String name;
}
