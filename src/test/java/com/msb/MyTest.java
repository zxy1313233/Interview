package com.msb;

import com.ywz.config.PassEncoding;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class MyTest {
    @Test
    public void Tets01(){
        PasswordEncoder pe = new BCryptPasswordEncoder();
        String encode = pe.encode("lili");
        System.out.println(encode);
    }

}
