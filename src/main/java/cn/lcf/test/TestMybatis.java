package cn.lcf.test;

import cn.lcf.dao.AccountDao;
import cn.lcf.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {



    @Test
    public void run01() throws Exception {

        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        SqlSession session = factory.openSession();

        AccountDao dao = session.getMapper(AccountDao.class);

        List<Account> acc = dao.findAll();
        for (Account account :
                acc) {
            System.out.println(account);
        }

        session.close();

        in.close();
    }

    @Test
    public void run02() throws Exception {

        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

        Account account = new Account();
        account.setName("呵呵");
        account.setMoney(3235d);
        dao.saveAccount(account);

        session.commit();
        session.close();
        in.close();
    }


}
