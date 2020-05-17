package com.xym.sql_inject.controller;

import com.xym.sql_inject.dao.SqlInjectDao;
import com.xym.sql_inject.dao.SqlInjectDaoNew;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version v1.0
 * @type：SqlInjectController.java
 * @description：TODO
 * @author：xym
 * @date：2020/5/17 15:33
 */
@RestController
@RequestMapping("sqlInject")
public class SqlInjectController {

    private final SqlInjectDao sqlInjectDao;
    private SqlInjectDaoNew sqlInjectDaoNew;

    public SqlInjectController(SqlInjectDao sqlInjectDao, SqlInjectDaoNew sqlInjectDaoNew) {
        this.sqlInjectDao = sqlInjectDao;
        this.sqlInjectDaoNew = sqlInjectDaoNew;
    }

    @RequestMapping("001")
    public Object sql(String username) {
        return sqlInjectDaoNew.find(username);
    }
}
