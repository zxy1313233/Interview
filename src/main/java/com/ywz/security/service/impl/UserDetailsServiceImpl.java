package com.ywz.security.service.impl;

import com.ywz.config.PassEncoding;
import com.ywz.mapper.UserMapper;
import com.ywz.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private PassEncoding passEncoding;
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.selectUserByUsername(username);
        System.out.println(user);
        if (user==null){
            throw new UsernameNotFoundException("用户不存在");
        }
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(username,user.getPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList("admin1,admin2"));
        return userDetails;
    }
}
