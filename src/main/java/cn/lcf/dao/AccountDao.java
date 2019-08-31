package cn.lcf.dao;

import cn.lcf.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户的持久层接口
 */
@Repository
public interface AccountDao {

    @Select("select * from account")
    public List<Account> findAll();

    @Insert(value="insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);

    @Delete(value = "delete from account where id = #{id}")
    public void delAccount(Integer id);

}
