package com.suguowen.test;

import com.suguowen.bean.StudentExample;
import com.suguowen.dao.StudentMapper;
import com.suguowen.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class JunitTest {

    @Autowired
    StudentMapper studentMapper;
    @Autowired
    StudentService studentService;

    /**
     * dao层测试
     */
    @Test
    public void test(){
        System.out.println("进入Junit");
        System.out.println(studentMapper.selectByPrimaryKey(1));
        System.out.println(studentMapper.selectByExample(new StudentExample()));
        studentMapper.selectByExample(new StudentExample());
        System.out.println("离开Junit");
    }

    /**
     * Service层测试
     */
    @Test
    public void test1(){
        System.out.println(studentService.getAll());
    }

    @Test
    public void test2(){

    }

}
