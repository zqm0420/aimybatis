package com.southwind.repository;

import com.southwind.entity.Account;

import java.util.List;

public interface AccountRepository {
    int save(Account account);
    int deleteByID(Integer id);
    int update(Account account);
    List<Account> findAll();
    Account findByID(Integer id);
}
