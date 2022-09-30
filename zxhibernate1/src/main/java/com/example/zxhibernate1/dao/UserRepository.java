package com.example.zxhibernate1.dao;


import com.example.zxhibernate1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 继承JpaRepository<User,Integer>
 *     User：要操作的表格对象
 *     Integer：主键 ID 的数据类型
 *
 *     继承的这个类里面封装了基本的增删改查方法直接调用即可，
 *     如果集成的方法没法满足需求，可以在此封装,但是一定要注意 “命名规范”
 */
@Repository(value = "userRepository")
public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> getByNameAndAge(String name,int age);


    @Modifying
    @Transactional
    @Query("update User u set u.name = :name,u.password = :password,u.age = :age where u.id=:id")
    public int queryUserById(@Param("id") Integer id, @Param("name") String name,@Param("password") String password,@Param("age") Integer age);
}



