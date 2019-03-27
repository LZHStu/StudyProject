package com.ch.webservicetest.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ch
 * @data 2019/3/20 - 22:42
 */
//加载外部配置文件
//@PropertySource(value = "classpath:person.properties")
@Component
@ConfigurationProperties(prefix = "persion")
@Getter
@Setter
@ToString
public class Person {

    private String lastName;
    private Integer age;
    private boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

}
