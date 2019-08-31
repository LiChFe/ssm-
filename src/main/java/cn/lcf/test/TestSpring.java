package cn.lcf.test;

import cn.lcf.domain.Account;
import cn.lcf.service.AccountService;
import cn.lcf.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {


    @Test
    public void run1(){

        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        AccountService ac = (AccountService)cs.getBean("accountService");

        ac.findAll();





    }

}
