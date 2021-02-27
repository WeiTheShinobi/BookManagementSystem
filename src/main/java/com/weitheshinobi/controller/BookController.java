package com.weitheshinobi.controller;

import com.weitheshinobi.pojo.Books;
import com.weitheshinobi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/book")
@Controller
public class BookController {

//    調用service層
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }

//    跳轉到增加書籍
    @RequestMapping("/toAddBook")
    public String toAddPage(){
        return "addBook";
    }

//    增加書籍
    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

//    跳轉到修改書籍
    @RequestMapping("/toUpdateBook/{bookID}")
    public String toUpdateBook(Model model,@PathVariable("bookID") int id){
        Books books = bookService.queryBookById(id);
        model.addAttribute("queryBooks",books);
        return "updateBook";
    }

//    修改書籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

//    刪除書籍
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

}
