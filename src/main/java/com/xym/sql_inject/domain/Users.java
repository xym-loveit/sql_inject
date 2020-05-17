package com.xym.sql_inject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @version v1.0
 * @type：Users.java
 * @description：TODO
 * @author：xym
 * @date：2020/5/17 15:37
 */
@Entity
@Table(name = "users")
public class Users {

    @Id
    private String username;
    @Column(name = "password")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
