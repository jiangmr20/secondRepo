package com.suguowen.dao;

import com.suguowen.bean.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(String username);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}