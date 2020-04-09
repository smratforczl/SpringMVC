<%--
  Created by IntelliJ IDEA.
  User: 12707
  Date: 2020/4/7
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <%-- 发起ajax请求 --%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-1.8.3.js"></script>
<%--    <script src="http://code.jquery.com/jquery-2.1.4.min.js" ></script>--%>
    <script type="text/javascript">
        function f1() {

            //type:请求的一个方式，dataType:参数类型
            //contextType:请求的正文类型:"application/json;charset:utf-8"

            $.ajax({
                url:'${pageContext.request.contextPath}/studentControllerPage2/getData2.do',
                type:'POST',
                contentType:"application/json;charset=utf-8",
                success:function (a) {
                    // alert("请求成功 ：" + a)
                    //1.当服务器接收到的响应是对象时，可以直接对象.属性
                    // alert("响应成功结果为:" + a + a.id + a.stuName + a.age);

                    //2.当服务器接收到的响应是集合时，需要遍历
                    // $(a).each(function (index,el) {
                    //     alert("遍历的元素为：" + el + "----" + el.id + "----" + el.stuName + "----" + el.age);
                    // })

                    //3.当服务器接收到的响应时JSON字符串数据时
                    //直接字符串转换成JSON对象
                    var objJson = $.parseJSON(a);
                    alert("objJson 的信息为 ：" + objJson.id + "----" +objJson.stuName + "----" + objJson.age)
                },
                error:function (a) {
                    alert("请求失败 ：" + a)
                }
            });
        }
    </script>
</head>
<body>

    <p onclick="f1();">点我响应数据</p>


</body>
</html>
