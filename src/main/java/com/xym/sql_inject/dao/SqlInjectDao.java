package com.xym.sql_inject.dao;

import com.xym.sql_inject.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @version v1.0
 * @type：SqlInjectDao.java
 * @description：TODO
 * @author：xym
 * @date：2020/5/17 15:34
 */
public interface SqlInjectDao extends JpaRepository<Users, Long>, JpaSpecificationExecutor<Users> {

    /**
     * 根据username查询user
     *
     * @param username
     * @return
     */
    @Query(value = "select username ,password from users where username=?1", nativeQuery = true)
    List<Users> find(String username);

}
