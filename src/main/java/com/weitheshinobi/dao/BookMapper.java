package com.weitheshinobi.dao;

import com.weitheshinobi.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

//    增加
    int addBook(Books books);
//    刪除
    int deleteBookById(@Param("bookId") int id);
//    修改
    int updateBook(Books books);
//    查詢
    Books queryBookById(@Param("bookId") int id);

    //查詢全部書本
    List<Books> queryAllBook();

//    書名查詢
    List<Books> queryBookByName(@Param("bookName") String bookName);

}
