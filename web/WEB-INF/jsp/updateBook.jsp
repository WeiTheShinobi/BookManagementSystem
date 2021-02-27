<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改</title>

    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12">
            <div class="page-header">
                <h1>
                    <small>修改書籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="">

        <input type="hidden" name="bookID" value="${queryBooks.bookID}">
        <div class="form-group">
            <label>書名</label>
            <input type="text" name="bookName" class="form-control" value="${queryBooks.bookName}" required>
        </div>
        <div class="form-group">
            <label>書籍數量</label>
            <input type="text" name="bookCounts" class="form-control" value="${queryBooks.bookCounts}" required>
        </div>
        <div class="form-group">
            <label>描述</label>
            <input type="text" name="detail" class="form-control" value="${queryBooks.detail} "required>
        </div>

        <br>
        <br>

        <div class="from-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>


</div>

</body>
</html>
