package com.ywz.mapper;

import com.ywz.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User selectUserByUsername(String username);
}
