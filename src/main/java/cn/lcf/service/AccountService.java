package cn.lcf.service;
/**
 * 账户业务层接口
 */

import cn.lcf.domain.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();

    public void saveAccount(Account account);

    public void delAccount(Integer id);

}
