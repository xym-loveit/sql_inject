package com.xym.sql_inject.dao;

import com.xym.sql_inject.domain.Users;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @version v1.0
 * @type：SqlInjectDaoNew.java
 * @description：TODO
 * @author：xym
 * @date：2020/5/17 16:36
 */
@Repository
public class SqlInjectDaoNew {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * 制造sql注入情况
     *
     * @param username
     * @return
     */
    public List<Users> find(String username) {
        String sql = "select username ,password from users where username='" + username + "'";
        List<Users> list = entityManager.createNativeQuery(sql).getResultList();
        return list;
    }
}
