package com.smart.dao;

import com.smart.domian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int getMatchCount(String username, String password) {
        String sql = "SELECR count(*) FROM t_user WHERE user_name=? AND password=?";
        return 1;
    }

    public User findUserByUserName() {
        return null;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
