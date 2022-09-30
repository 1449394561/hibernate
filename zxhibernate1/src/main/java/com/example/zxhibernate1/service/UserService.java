package com.example.zxhibernate1.service;


import com.example.zxhibernate1.entity.User;
import com.example.zxhibernate1.util.Result;

/**
 * 接口层:负责逻辑处理访问数据库层
 */
public interface UserService {
    /**
     * 保存 user 对象
     *
     * @param user
     * @return
     */
    Result saveUser(User user);

    /**
     * 查询所有user
     *
     * @return
     */
    Result queryAll();

    /**
     * 通过name和age查询
     *
//     * @param name
//     * @param age
     * @return
     */
    Result getByNameAndAge(String name, int age);

    public Result deleteUser(Integer id);

    public Result updateUser(Integer id,String name,String password,Integer age);
}



