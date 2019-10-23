package cn.tx.service;

import cn.tx.model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:Application.xml")
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;



    @Test
    public void getAccountById(){
        Account account = accountService.getAccountById(1);
        System.out.println(account);
    }

}


