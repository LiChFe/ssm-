package cn.lcf.service.impl;
/**
 * 账户业务层实现类
 */

import cn.lcf.dao.AccountDao;
import cn.lcf.domain.Account;
import cn.lcf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;


    public List<Account> findAll() {
        System.out.println("业务层，查询账号所有信息");
        return accountDao.findAll();
    }

    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户信息。。。。");
        accountDao.saveAccount(account);
    }

    public void delAccount(Integer id){
        System.out.println("业务层，删除账户信息");
        accountDao.delAccount(id);
    }
}