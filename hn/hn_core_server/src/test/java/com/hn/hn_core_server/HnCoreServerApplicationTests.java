package com.hn.hn_core_server;

import com.hn.hn_common.utils.TestCom;
import com.hn.hn_core_server.service.TestService;
import com.hn.hn_pojo.DTO.UserVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HnCoreServerApplicationTests {

    @Test
    public void contextLoads() {

        System.out.println("Test-Cheny");
    }

    @Autowired
    private TestService testImpl;

    @Test
    public void testPojo() {

        UserVO userVO = new UserVO();
        userVO.setUserName("Mengxd");
        userVO.setrName("孟晓栋");
        userVO.setPassWord("111111");
        System.out.println("Pojo:"+userVO);

    }

    @Test
    public void testCom() {

        TestCom tc = new TestCom();
        String str = tc.testGet("Chenyb");
        System.out.println(str);

    }
}
