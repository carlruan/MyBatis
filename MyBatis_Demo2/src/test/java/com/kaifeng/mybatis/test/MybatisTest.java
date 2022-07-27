package com.kaifeng.mybatis.test;

import com.kaifeng.mybatis.mapper.UserMapper;
import com.kaifeng.mybatis.pojo.User;
import com.kaifeng.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class MybatisTest {

    @Test
    public void testMybatis() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.deleteMore("6,7"));
    }

}
