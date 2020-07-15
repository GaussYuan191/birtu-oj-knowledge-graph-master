package com.zyaml.nai.entry.from;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @program: birtu-oj-knowledge-graph-master 2
 * @description: 用户注册
 * @author: Gauss
 * @date: 2020-07-14 11:32
 **/
@Data
public class AddUserFrom {
    @NotBlank
    private String username;
    private String name;
    private String password;

}
