package cn.tx.service;

import cn.tx.model.Account;

import java.util.List;

public interface AccountService {

    public List<Account> selectAll();

    public Account getAccountById(int accountId);

    public void save(Account account);
}

