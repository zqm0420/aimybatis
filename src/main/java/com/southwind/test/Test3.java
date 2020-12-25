package com.southwind.test;

import com.southwind.entity.Classes;
import com.southwind.entity.Customer;
import com.southwind.entity.Goods;
import com.southwind.entity.Student;
import com.southwind.repository.ClassesDao;
import com.southwind.repository.CustomerDao;
import com.southwind.repository.GoodsDao;
import com.southwind.repository.StudentDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * 测试级联查询
 */
public class Test3 {
    public static void main(String[] args) {
        InputStream inputStream = Test3.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            //一对多
//            ClassesDao classesDao = sqlSession.getMapper(ClassesDao.class);
//            Classes classes = classesDao.findByID(1);
//            System.out.println(classes);
//            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
//            List<Student> students = studentDao.findAll();
//            System.out.println(students);
            //多对多
//            CustomerDao customerDao = sqlSession.getMapper(CustomerDao.class);
//            List<Customer> list = customerDao.findByID(1);
//            System.out.println(list);
            GoodsDao goodsDao = sqlSession.getMapper(GoodsDao.class);
            List<Goods> list = goodsDao.findByID(1);
            System.out.println(list);

        }
    }
}
