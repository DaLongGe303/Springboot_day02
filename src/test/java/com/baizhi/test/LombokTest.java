package com.baizhi.test;

import com.baizhi.dao.WokaoDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LombokTest {
    @Autowired
    private WokaoDao wokaoDao;

    @Test
    public void test(){
        System.out.println(wokaoDao.selectAll()+"//////");
    }
}
