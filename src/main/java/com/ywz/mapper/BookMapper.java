package com.ywz.mapper;

import com.ywz.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookMapper {
    List<Book> showBook(Book book);
    List<Book> showAllBook();
    Integer updateBook(Book book);

}
