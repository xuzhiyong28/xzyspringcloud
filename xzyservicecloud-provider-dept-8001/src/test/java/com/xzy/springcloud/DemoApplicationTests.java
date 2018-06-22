package com.xzy.springcloud;/**
 * Created by Administrator on 2018-05-23.
 */

import com.xzy.springcloud.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xuzhiyong
 * @createDate 2018-05-23-16:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private DeptService deptService;
    @Test
    public void test(){

    }
}
