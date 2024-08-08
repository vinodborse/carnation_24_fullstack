package com.ts.service;

import java.util.List;

import com.ts.model.Bank;
import com.ts.model.ResponseDTO;
import com.ts.model.UserDetailsDTO;

public interface BankService {
	
	Bank register(Bank bank);

	List<UserDetailsDTO> getAllUsers();

	String transfer(Long fromAccount, Long toAccount, Long amount);

	ResponseDTO delete(Long accNo);
}
