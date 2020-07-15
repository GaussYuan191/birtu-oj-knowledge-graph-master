package com.zyaml.nai.service.UserService;

import com.zyaml.nai.Exception.Resp;
import com.zyaml.nai.entry.node.User;
import com.zyaml.nai.repository.UserCql;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: birtu-oj-knowledge-graph-master 2
 * @description: 登入功能实现,接口
 * @author: Gauss
 * @date: 2020-07-14 16:33
 **/
@Log4j2
@Service
public class LoginService {
    @Autowired
    UserCql userCql;

    public Resp Login(String username,String passwrod){
        List<User> userList = userCql.findByUsername(username);
        //如果在数据库中找不到该用户
        if(userList == null){
            return new Resp(404,"该用户不存在");
        }
        else{
            User user = userList.get(0);
            if(user.getPassword().equals(passwrod)){
                log.debug(user.getUsername() + "登入成功");
                return new Resp("200","登入成功");
            }
            else{
                log.debug(user.getUsername() + "密码错误");
                return new Resp(500,"密码错误");
            }
        }

    }
}
