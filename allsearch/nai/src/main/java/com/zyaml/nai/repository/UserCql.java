package com.zyaml.nai.repository;

import com.zyaml.nai.entry.node.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @program: birtu-oj-knowledge-graph-master 2
 * @description: 用户信息仓库
 * @author: Gauss
 * @date: 2020-07-14 11:11
 **/
public interface UserCql extends CrudRepository<User, Integer> {
    List<User>findByUsername(String username);
}
