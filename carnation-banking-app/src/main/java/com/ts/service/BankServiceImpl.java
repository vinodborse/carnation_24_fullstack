package com.ts.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Bank;
import com.ts.repository.BankRepository;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	BankRepository bankRepository;
	
	@Override
	public Bank register(Bank bank) {

		Random random = new Random(); //0 - 100000
		Long acc = random.nextLong(100000); // 234, 657, 9999, 234
		//check acc no. is unique or not
		bank.setAccountNumber(acc);
		
		return bankRepository.save(bank);
		
	}

	@Override
	public List<Bank> getAllUsers() {
		// only show username and account number
		return bankRepository.findAll();
	}

	@Override
	public String transfer(Long fromAccount, Long toAccount, Long amount) {
		
		Bank fromAcc = bankRepository.findByAccountNumber(fromAccount).get();
		Bank toAcc = bankRepository.findByAccountNumber(toAccount).get();
				
		//check accounts are available or not
		
		//check balance of fromAccount (>=amount)

		fromAcc.setBalance(fromAcc.getBalance() - amount);
		
		toAcc.setBalance(toAcc.getBalance() + amount);
		
		bankRepository.save(fromAcc);
		bankRepository.save(toAcc);
		
		return "Amount transfer successfully";
	}

}
