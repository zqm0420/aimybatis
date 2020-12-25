package com.southwind.test;

import com.southwind.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test2 {
    public static void main(String[] args) {
        InputStream inputStream = Test2.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            //这里mybatis用代理的方式将accountRepository的实现类已经创建好了
            AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
//            System.out.println(accountRepository.save(new Account(null, "徐恬", "123", 26)));
//            System.out.println(accountRepository.update(new Account(1, "张帅","123123", 18)));
//            System.out.println(accountRepository.findAll());
            System.out.println(accountRepository.deleteByID(5));
//            System.out.println(accountRepository.findByID(1));
            sqlSession.commit();

        }
    }
}
