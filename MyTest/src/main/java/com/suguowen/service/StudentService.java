package com.suguowen.service;

import com.suguowen.bean.Student;
import com.suguowen.bean.StudentExample;
import com.suguowen.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    //查询所有员工
    public List<Student> getAll() {

        System.out.println("==========进入Service=======");

        List<Student> list = studentMapper.selectByExample(null);
        return list;
    }

    /*
     * 按员工id查询员工
     */
    public void saveEmp(Student student) {
        studentMapper.insertSelective(student);
    }

    public Student getEmp(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    /*
     * 员工更新
     */
    public void updateEmp(Student student) {
        studentMapper.updateByPrimaryKeySelective(student);
    }
    /*
     * 员工删除
     */
    public void deleteEmp(Integer id) {
        studentMapper.deleteByPrimaryKey(id);
    }

    public void delectBatch(List<Integer> ids) {
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        //delete from xxx where emp_id in(1,2,3)
        criteria.andStuIdIn(ids);
        studentMapper.deleteByExample(example);
    }
}
