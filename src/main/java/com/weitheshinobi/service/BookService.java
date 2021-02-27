package com.weitheshinobi.service;

import com.weitheshinobi.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //    增加
    int addBook(Books books);
    //    刪除
    int deleteBookById(int id);
    //    修改
    int updateBook(Books books);
    //    查詢
    Books queryBookById(int id);

    //查詢全部書本
    List<Books> queryAllBook();

    List<Books> queryBookByName(String bookName);

}
