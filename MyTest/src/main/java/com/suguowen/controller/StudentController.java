package com.suguowen.controller;

import com.suguowen.bean.Msg;
import com.suguowen.bean.Student;
import com.suguowen.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {
    @Autowired
    StudentService studentServer;
    /**
     * 查询
     */
    @RequestMapping(value="/stu/{id}",method=RequestMethod.GET)
    @ResponseBody
    public Msg getEmp(@PathVariable("id")Integer id) {
        Student student = studentServer.getEmp(id);
        return Msg.success().add("emp", student);
    }
    //查询所有数据
    @ResponseBody
    @RequestMapping("/stus")
    public Msg getEmps(@RequestParam(value="pn",defaultValue="1")Integer pn) {
        System.out.println("==========进入Controller=======");
        List<Student> list = studentServer.getAll();
        return Msg.success().add("list", list);
    }
    /*
     * 修改
     */
    @RequestMapping(value="/stu/{id}" ,method = RequestMethod.PUT)
    @ResponseBody
    public Msg updateEmp(Student student) {
        studentServer.updateEmp(student);
        return Msg.success();
    }

    /*
     * 新增
     * @valid保存校验规则
     * BindingResult绑定校验结果
     */
    @RequestMapping(value="/stu",method=RequestMethod.POST)
    @ResponseBody
    public Msg saveEmp(@Valid Student student, BindingResult result) {
        System.out.println("==========");
        System.out.println(student);
        if(result.hasErrors()) {
            //校验失败，应该返回失败，在模态框中显示失败的信息
            Map<String, Object> map = new HashMap<String, Object>();
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError fieldError : errors) {
                System.out.println("错误字段名："+fieldError.getField());
                System.out.println("错误信息："+fieldError.getDefaultMessage());
                map.put(fieldError.getField(), fieldError.getDefaultMessage());
            }
            return Msg.fail().add("errorFields", map);
        }else {
            studentServer.saveEmp(student);
            return Msg.success();
        }
    }
    /*
     * 删除
     * 单个批量二合一
     * 批量删除：1-2-3
     * 单个删除：1
     */
    @RequestMapping(value="stu/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteEmp(@PathVariable("ids")String ids) {
        if(ids.contains("-")) {
            List<Integer> del_ids = new ArrayList<Integer>();
            String[] str_ids = ids.split("-");
            //组装id集合
            for (String idString : str_ids) {
                del_ids.add(Integer.parseInt(idString));
                studentServer.delectBatch(del_ids);
				/*Integer idInt = Integer.parseInt(idString);
				employeeService.deleteEmp(idInt);*/
            }
        }else {
            Integer id = Integer.parseInt(ids);
            studentServer.deleteEmp(id);
        }

        return Msg.success();
    }
}
