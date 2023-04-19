package com.study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class SpringBootStudyApplicationTests {


//	密码加密
@Test
void contextLoads() {
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	System.out.println(encoder.encode("123456"));
}

}
