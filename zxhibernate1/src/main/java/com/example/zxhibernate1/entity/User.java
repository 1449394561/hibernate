package com.example.zxhibernate1.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.*;

@ToString
@Entity
@Table(name="wd")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="password")
    private String password;

    @Column(name="code")
    private int age;



    public User() {}
    public User(String name, String password,Integer code) {
        this.name=name;
        this.password=password;
        this.age=code;
    }
}
