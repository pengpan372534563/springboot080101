package com.whhp.springboot080101;

import com.whhp.springboot080101.entity.Emp;
import com.whhp.springboot080101.mapper.EmpMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot080101ApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testSelectOne() {
        Emp emp = empMapper.selectById(1);
        System.out.println(emp);
    }

}
