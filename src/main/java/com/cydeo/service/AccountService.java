package com.cydeo.service;

import com.cydeo.dto.AccountDTO;

import java.util.List;

public interface AccountService {

    void createNewAccount(AccountDTO accountDTO);

    List<AccountDTO> listAllAccounts();

    void deleteAccount(Long id);

    void activateAccount(Long id);

    AccountDTO findById(Long id);

    List<AccountDTO> listAllActiveAccounts();

    void updateAccount(AccountDTO accountDTO);
}
