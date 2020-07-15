package com.zyaml.nai.entry.node;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: birtu-oj-knowledge-graph-master 2
 * @description: 用户实体,用户注册登入
 * @author: Gauss
 * @date: 2020-07-14 10:56
 **/
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer uid;         //用户id
    private String username;     //用户名
    private String name;         //用户名称
    private String password;     //用户密码
    private Integer groupid = 2;     //用户身份
    private String reg_time;   //注册时间
    private Integer points = 0;      //用户积分

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", groupid=" + groupid +
                ", reg_time=" + reg_time +
                ", points=" + points +
                '}';
    }

}
