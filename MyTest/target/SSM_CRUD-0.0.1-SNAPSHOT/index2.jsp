<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <%
        pageContext.setAttribute("path", request.getContextPath());
    %>
    <!-- Web路径
    不以/开始的相对路径，找资源，以当前路径为基准容易出问题
    以/开始的相对路径，找资源以服务器路径为基准（http://localhost；3306），需要加上项目名
    http://localhost:3306/SSM_CRUD
     -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>学生成绩管理系统</title>
    <!-- bootstrap-->
    <script src="${path}/static/viewresource/jquery.min.js"></script>
    <script src="${path}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <link href="${path}/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <%--     	<script src="${path }/static/viewresource/jquery.min.js"></script>
        <script src="${path }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
        <link href="${path }/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet"> --%>
</head>
<body>
<h1 align="center">学生成绩管理系统</h1>
<form class="form-inline">
    <div class="form-group">
        <label for="exampleInputName2">学生成绩查询：</label>
        <input type="text" class="form-control btn_select_input" id="exampleInputName2" placeholder="Jane Doe">
    </div>
    <button type="button" class="btn btn-primary btn_select">查询</button>
</form>
<button type="button" class="btn btn-success btn_add" data-toggle="modal" data-target="#stuAddModel">录入</button>
<button type="button" class="btn btn-success btn_mdify" data-toggle="modal" data-target="#stuUpdateModel">修改</button>
<!-- 显示表格 -->
<div class="row">
    <div class="col-md-12">
        <table class="table table-hover" id="stu_tables">
            <thead>
            <tr>
                <th>#</th>
                <th>名字</th>
                <th>语文</th>
                <th>数学</th>
                <th>英语</th>
                <th>按钮</th>
            </tr>
            </thead>
            <tbody >

            </tbody>
        </table>
    </div>
</div>

<!-- 新增stu模态框 -->
<%--<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#emp_add_model">Launch demo modal</button>--%>
<!-- Modal -->
<div class="modal fade" id="stuAddModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">添加学生成绩</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">名字</label>
                        <div class="col-sm-10">
                            <input type="text" name="stuName" class="form-control" id="stuName_add_input" placeholder="stuName">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">语文</label>
                        <div class="col-sm-10">
                            <input type="text" name="chinese" class="form-control" id="chineseScore_add_input" placeholder="chineseScore">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">数学</label>
                        <div class="col-sm-10">
                            <input type="text" name="math" class="form-control" id="mathScore_add_input" placeholder="mathScore">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">英语</label>
                        <div class="col-sm-10">
                            <input type="text" name="english" class="form-control" id="englishScore_add_input" placeholder="englishScore">
                            <span class="help-block"></span>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="stu_add_save_btn">保存</button>
            </div>
        </div>
    </div>
</div>
<!-- 修改stu模态框 -->
<%--<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#emp_add_model">Launch demo modal</button>--%>
<!-- Modal -->
<div class="modal fade" id="stuUpdateModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">学生成绩修改</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">学号</label>
                        <div class="col-sm-10">
                            <input type="text" name="stuId" class="form-control" id="stuId_update_input" placeholder="stuId">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">名字</label>
                        <div class="col-sm-10">
                            <input type="text" name="stuName" class="form-control" id="stuName_update_input" placeholder="stuName">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">语文</label>
                        <div class="col-sm-10">
                            <input type="text" name="chinese" class="form-control" id="chinese_update_input" placeholder="chineseScore">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">数学</label>
                        <div class="col-sm-10">
                            <input type="text" name="math" class="form-control" id="math_update_input" placeholder="mathScore">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">英语</label>
                        <div class="col-sm-10">
                            <input type="text" name="english" class="form-control" id="english_update_input" placeholder="englishScore">
                            <span class="help-block"></span>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="stu_modify_update_btn">更新</button>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
    $(function() {
        //去首页
        to_page();
    });
    function to_page() {
        $.ajax({
            url : "${path}/stus",
            type : "GET",
            success : function(result) {
                //构建表格
                create_table(result);
            }
        });
    }

    //生成学生表单
    function create_table(result){
        var stus;
        if(result.extend.list == null){
            stus = result.extend.emp;
            PutData2Table(stus);
        }else{
            stus = result.extend.list;
            $
                .each(
                    stus,
                    function(index, item) {
                        PutData2Table(item);
                    });
        }
    }

    //数据嵌入 <tbody>
    function PutData2Table(item){
        //foreach:emps是list对象，item是list的emp对象,index下标
        var stuIdTd = $("<td></td>").append(item.stuId);
        var stuNameTd = $("<td></td>").append(
            item.stuName);
        var chineseScoreTd = $("<td></td>").append(
            item.chinese);
        var mathScoreTd = $("<td></td>").append(item.math);
        var englishScoreTd = $("<td></td>").append(
            item.english);

        /* <button class="btn btn-primary">新增</button>
        <button class="btn btn-danger">删除</button> */

        var delBtn = $("<button></button>")
            .addClass(
                "btn btn-danger btn-sm delete_btn")
            .append(
                $("<span></span>")
                    .addClass(
                        "glyphicon glyphicon-trash"))
            .append("删除");
        //为删除按钮添加自定义属性，来表示当前员工id
        delBtn.attr("del-id", item.stuId);

        var btnTd = $("<td></td>").append(delBtn);

        //append方法执行完返回员原来的原来的元素
        $("<tr></tr>").append(
            stuIdTd).append(stuNameTd).append(
            chineseScoreTd).append(mathScoreTd).append(
            englishScoreTd).append(btnTd).appendTo(
            "#stu_tables tbody");
    }

    //查询按钮
    $(document).on("click", ".btn_select", function() {
        //先清空，在查询
        $("#stu_tables tbody").empty();
        var stuId = $(".btn_select_input").val();
        $.ajax({
            url : "${path}/stu/" + stuId,
            type : "GET",
            success : function(result) {
                //构建表格
                create_table(result);
            }
        });
    });

    //删除按钮
    $(document).on("click", ".delete_btn", function() {
        //1.弹出确认删除对话框
       // alert($(this).parents("tr").find("td:eq(1)").text());
        var stuId = $(this).parents("tr").find("td:eq(0)").text();
        var stuName = $(this).parents("tr").find("td:eq(1)").text();
        if (confirm("确认删除【" + stuName + "】吗？")) {
            //确认，发送ajax请求删除即可
            $.ajax({
                url : "${path}/stu/" + stuId,
                type : "DELETE",
                success : function(result) {
                    alert(result.msg);
                    //回到本页
                    location.reload();
                }
            });
        }
    });

    //录入按钮
    $(document).on("click", ".btn_add", function() {

    });

    //添加按钮，点击保存，保存员工
    $("#stu_add_save_btn")
        .click(
            function() {
                //1.发送ajax请求保存员工
                //serialize把表格数据序列化传给服务器
                $
                    .ajax({
                        url : "${path}/stu",
                        type : "post",
                        data : $("#stuAddModel form")
                            .serialize(),
                        success : function(result) {
                            if (result.code == 100) {
                                //员工保存成功
                                //1.关闭模态框
                                $("#stuAddModel").modal('hide');
                                //2.来到最后一页，显示刚才保存的数据 ，需要考虑如果最后一页满了要跳页，幸好pageInfo提供了支持
                                location.reload();
                                to_page();
                            } else {
                                alert("插入失败");
                            }
                        }
                    });

            });
    //更新按钮
    $("#stu_modify_update_btn").click(function() {

        //1.发送ajax请求保存更新的员工数据  $("#stuId_update_input").val()
        var updateId = $("#stuId_update_input").val();
        var updateName = $("#stuName_update_input").val();
        var updateChinese = $("#chinese_update_input").val();
        var updateMath = $("#math_update_input").val();
        var updateEnglish = $("#english_update_input").val();
        var stuUpdateModel = $("#stuUpdateModel form")
            .serialize();
        alert(stuUpdateModel);

        $.ajax({
            url : "${path}/stu/" + $("#stuId_update_input").val(),
            /* type:"POST", */
            type: "put",
            data : stuUpdateModel,
            success : function(result) {
                alert(result.msg);
                //1.关闭模态框
                $("#empUpdateModel").modal("hide");
                //2.回到页面
                to_page();
            }
        });
    });
</script>
</body>
</html>