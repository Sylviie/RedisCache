package cn.tx.service.impl;

import cn.tx.dao.AccountMapper;
import cn.tx.model.Account;
import cn.tx.service.AccountService;
import cn.tx.service.RedisCacheUtil;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Autowired
    private RedisCacheUtil<Account> redisCacheUtil;

    
    public List<Account> selectAll() {
        return accountMapper.selectAll();
    }


    @Cacheable(value = "accountCache")
    public Account getAccountById(int accountId) {
        Account account = accountMapper.getAccountById(accountId);
        return account;
    }
    
    public void save(Account account){
        accountMapper.save(account);
    }
}
