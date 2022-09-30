package com.example.zxhibernate1.service.impl;



import com.example.zxhibernate1.dao.UserRepository;
import com.example.zxhibernate1.entity.User;
import com.example.zxhibernate1.service.UserService;
import com.example.zxhibernate1.util.Result;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 实现接口的抽象方法
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserRepository userRepository;

    @Override
    public Result saveUser(User user) {
        User save = userRepository.save(user);
        return new Result(save);
    }

    @Override
    public Result deleteUser(Integer id) {
        userRepository.deleteById(id);
        return new Result("200");
    }

    @Override
    public Result queryAll() {
        List <User> list = userRepository.findAll();
        return new Result(list);
    }

    @Override
    public Result getByNameAndAge(String name, int age) {
        List <User> list = userRepository.getByNameAndAge(name, age);
        return new Result(list);
    }

    @Override
    public Result updateUser(Integer id,String name,String password,Integer age) {
        userRepository.queryUserById(id, name, password, age);
        return new Result("200");
    }
}



