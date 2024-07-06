package com.ywz.controller;

import com.google.gson.Gson;
import com.ywz.mapper.BookMapper;
import com.ywz.pojo.Book;
import com.ywz.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@Controller
public class DemoController {
    @Autowired
    private BookMapper bookMapper;

    @RequestMapping("/showlogin")
    public String Test2(){
        return "login";
    }

    @RequestMapping("/ywz")

    protected void listBook(Book book ,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(book);
        List<Book> list = bookMapper.showBook(book);
        String s = new Gson().toJson(list);
        System.out.println(s);
        resp.getWriter().println(s);
    }

/*    @RequestMapping("/update")
    protected void updateBook(Book book,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取前台传入的数据：
        String name = req.getParameter("id");
        String sdesc = req.getParameter("");
        int cid = Integer.parseInt(req.getParameter("cid"));
        Book book1 = new Book(0,sname,sex,hobby,birthday,phone,sdesc,cid);
        //调用service方法
        int i = studentService.addClass(s);
        resp.getWriter().println(i);
    }*/

}
