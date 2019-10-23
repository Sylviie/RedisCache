package cn.tx.dao;

import cn.tx.model.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {

    public List<Account> selectAll();

    public Account getAccountById(int accountId);

    public void save(Account account);
}

