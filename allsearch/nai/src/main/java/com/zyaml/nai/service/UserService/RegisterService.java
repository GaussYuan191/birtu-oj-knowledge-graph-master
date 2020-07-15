package com.zyaml.nai.service.UserService;

import com.zyaml.nai.Exception.Resp;
import com.zyaml.nai.entry.from.AddUserFrom;
import com.zyaml.nai.entry.node.User;
import com.zyaml.nai.repository.UserCql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: birtu-oj-knowledge-graph-master 2
 * @description: 注册服务
 * @author: Gauss
 * @date: 2020-07-14 16:36
 **/
@Service
public class RegisterService {

    @Autowired
    private UserCql userCql;

    public Resp Register(AddUserFrom userFrom){
        User user = new User();
        user.setUsername(userFrom.getUsername());
        user.setName(userFrom.getName());
        user.setPassword(userFrom.getPassword());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        user.setReg_time(sdf.format(new Date()));
        userCql.save(user);
        user.setPassword("@");
        return new Resp(user);
    }
}
